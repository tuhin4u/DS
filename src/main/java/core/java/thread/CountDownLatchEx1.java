package core.java.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchEx1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(3);
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i = 1; i <=4 ; i++) {
            executorService.submit(new Task3(i,latch));
        }
        latch.await();
    }
}
class Task3 implements Runnable{

    private int i;
    CountDownLatch latch;

    public Task3(int i, CountDownLatch latch) {
        this.i = i;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Task "+i+" started execution");

        for (int i=0;i<10;i++){}
        System.out.println("Task "+i+" completed execution");
        latch.countDown();
        System.out.println(latch.getCount());
    }
}
