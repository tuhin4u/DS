package core.java.thread;

public class ThreadStopEx1 {
    public static void main(String[] args) throws InterruptedException {
        Task t=new Task();
        Thread t1=new Thread(t);
        t1.start();
        Thread.sleep(10);
        t1.interrupt();
    }
}
class Task implements Runnable{

    @Override
    public void run() {
        int i=0;
        System.out.println("Task started");
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(++i);
        }
        System.out.println("Task is interrupted");
    }
}
