package core.java.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThredEx6 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(10);
        PrintTask printTask = new PrintTask(0);

        for (int i=1;i<=10;i++){
            service.submit(printTask);
        }
//        service.shutdown();
    }
}
class PrintTask implements Runnable{
     volatile int count;

    public PrintTask(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (this){
            int n=count;
            count++;

            System.out.println(Thread.currentThread().getName());
            System.out.println("count: "+n);
            System.out.println("i: "+n*10);
            System.out.println("max: "+n+9);

//                for (int i=n*10;i<10+n;i++){
//                    System.out.println("----------------------------");
//                    System.out.println(i+1);
//                }
            new PrintDisplay().print(n*10,10+n);
        }

    }

}
class PrintDisplay{
    public static synchronized void print(int start,int end){
        System.out.println("----------------------------");
        boolean flag=true;
        while (flag){
            for (int i=start;i<end;i++){
                System.out.println(i+1);
                flag=false;
            }
        }

    }
}
