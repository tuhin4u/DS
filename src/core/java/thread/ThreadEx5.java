package core.java.thread;

/**
 * Created by U6042192 on 01-Nov-17.
 */
class Display1{
    public void wish(String name){
        for (int i = 0; i <10 ; i++) {
            System.out.print("Good Morning: ");
            synchronized (Display1.class){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(name);
        }
    }
}
class MyThread3 extends Thread{
    Display1 d;
    String name;

    MyThread3(Display1 d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class ThreadEx5 {
    public static void main(String[] args) {
        Display1 d1=new Display1();
        Display1 d2=new Display1();
        MyThread3 t1=new MyThread3(d1,"A");
        MyThread3 t2=new MyThread3(d2,"B");

        t1.start();
        t2.start();

    }
}

