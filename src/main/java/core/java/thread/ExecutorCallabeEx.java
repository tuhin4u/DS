package core.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorCallabeEx {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 20; i++) {
            service.execute(()->{
                String name=Thread.currentThread().getName();
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
