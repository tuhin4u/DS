package core.java.thread;

public class TreadStopEx2
{
    public static void main(String[] args) throws InterruptedException {
        Task2 task=new Task2();
        Thread t=new Thread(task);
        t.start();
        Thread.sleep(10);
        System.out.println();
        task.flag=Boolean.FALSE;
    }
}
class Task2 implements Runnable{
    public volatile Boolean flag=Boolean.TRUE;

    @Override
    public void run() {
        int i=0;
        System.out.println("Task processing started");
        while (flag){
            System.out.println(++i);
        }
        System.out.println("Task processing Stopped");
    }
}
