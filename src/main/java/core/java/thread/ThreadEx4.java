package core.java.thread;

/**
 * Created by U6042192 on 01-Nov-17.
 */
class Display{
    public static synchronized void wish(String name){
        for (int i = 0; i <10 ; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
    public static synchronized void print(String thredname){
        for (int i = 0; i <10 ; i++) {
            System.out.println("FROM THREAD: "+thredname);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread1 extends Thread{
    Display d;
    String name;

    MyThread1(Display d,String name){
        this.d=d;
        this.name=name;
    }
    @Override
    public void run() {
        d.wish(name);
    }
}
class MyThread2 extends Thread{
    Display d;
    String threadName;

    MyThread2(Display d,String threadName){
        this.d=d;
        this.threadName=threadName;
    }
    @Override
    public void run() {
        d.print(threadName);
    }
}
public class ThreadEx4 {
    public static void main(String[] args) {
        Display d1=new Display();
        MyThread1 t1=new MyThread1(d1,"A");
        MyThread2 t2=new MyThread2(d1,"Second Thread");

        t1.start();
        t2.start();
    }
}
