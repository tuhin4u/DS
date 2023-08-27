package core.java.thread.threadSequencing;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierEx1 {
    public static void main(String[] args) {
        CyclicBarrier barrier=new CyclicBarrier(3);
        ExecutorService service= Executors.newCachedThreadPool();
        service.submit(new Task1("producer",barrier));
        service.submit(new Task1("consumer",barrier));
        service.submit(new Task1("auditor",barrier));
    }


}
class Task1 implements Runnable{
    String name;
    CyclicBarrier barrier;

    public Task1(String name, CyclicBarrier barrier) {
        this.name = name;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println("Started Thread-------"+name);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed Thread-------"+name);
        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        if(name.equalsIgnoreCase("auditor")){
            System.out.println("auditing is done producer and consumer");
        }
//        if(name.equalsIgnoreCase("producer")){
//            System.out.println("auditing is done producer and consumer");
//        }
    }
}
