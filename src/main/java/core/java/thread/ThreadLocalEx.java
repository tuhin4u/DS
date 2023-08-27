package core.java.thread;

public class ThreadLocalEx {
    public static void main(String[] args) {
        ThreadLocal <String> threadLocal=new ThreadLocal<>();

        Thread t1=new Thread(()->{
            threadLocal.set("thread1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            threadLocal.remove();
            String val= threadLocal.get();
            System.out.println(Thread.currentThread().getName()+" -> "+val);
        });

        Thread t2=new Thread(()->{
            threadLocal.set("thread2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String val= threadLocal.get();
            System.out.println(Thread.currentThread().getName()+" -> "+val);
        });
        t1.start();
        t2.start();
    }
}
