package core.java.thread;

/**
 * Created by U6042192 on 01-Nov-17.
 */
class MyRunnable1 implements Runnable{
    int i=0;
    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println(Thread.currentThread().getName()+"->"+i++);
        }
    }
}
public class ThreadEx2 {
    public static void main(String[] args) {
        MyRunnable1 r=new MyRunnable1();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.start();
        t2.start();

    }
}
