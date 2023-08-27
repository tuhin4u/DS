package core.java.thread;

/**
 * simple thread creation by using Thread class
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread: "+i);
        }
    }
}
public class ThreadEx1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t.join();

        for (int i = 0; i <10 ; i++) {
            System.out.println("main thread: "+i);
        }

    }
}
