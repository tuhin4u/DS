package core.java.thread.lock;

import java.util.concurrent.locks.ReentrantLock;


public class ReenytrantLockEx2 {
    static class MyThread extends Thread{
        ReentrantLock lock;
        public MyThread(String name, ReentrantLock lock) {
            super(name);
            this.lock=lock;
        }

        @Override
        public void run() {
            if (lock.tryLock()){
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(500);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                }
                lock.unlock();
            }else {
                System.out.println(Thread.currentThread().getName()+" -- can not get the lock");
            }

        }
    }

    public static void main(String[] args) {
        ReentrantLock lock= new ReentrantLock();
        MyThread t1= new MyThread("t1",lock);
        MyThread t2= new MyThread("t2",lock);

        t1.start();
        t2.start();
    }
}
