package core.java.thread.threadSequencing;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownlatchEx2 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(2);
        ExecutorService service= Executors.newCachedThreadPool();
        service.submit(new DependentServices("A",latch));
        service.submit(new DependentServices("B",latch));

        //until and unless latch becomes 0 the main thread wont proceed
        latch.await();
        Thread.sleep(10);
        System.out.println("main thread completed after count downlatch");
    }
}
class DependentServices implements Runnable{

    String name;
    CountDownLatch countDownLatch;

    public DependentServices(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
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
        countDownLatch.countDown();
    }
}
