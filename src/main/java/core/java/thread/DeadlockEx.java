package core.java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Runnable1 implements Runnable{

    Lock lock1= null;
    Lock lock2=null;

    public Runnable1(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName= Thread.currentThread().getName();
        System.out.println(threadName+ " attempting to lock1");
        lock1.lock();
        System.out.println(threadName+ " locked lock1");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName+ " attempting to lock2");
        lock2.lock();
        System.out.println(threadName+" locked lock2");

        //do the  work here, as both the locks are acquired

        //unlocking
        System.out.println(threadName+" unlocking lock1");
        lock1.unlock();
        System.out.println(threadName+" unlocking lock2");
        lock2.unlock();

    }
}

class Runnable2 implements Runnable{

    Lock lock1= null;
    Lock lock2=null;

    public Runnable2(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName= Thread.currentThread().getName();
        System.out.println(threadName+ " attempting to lock2");
        lock2.lock();
        System.out.println(threadName+ " locked lock2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName+ " attempting to lock1");
        lock1.lock();
        System.out.println(threadName+" locked lock1");

        //do the  work here, as both the locks are acquired

        //unlocking
        System.out.println(threadName+" unlocking lock2");
        lock2.unlock();
        System.out.println(threadName+" unlocking lock1");
        lock1.unlock();

    }
}
public class DeadlockEx {
    public static void main(String[] args) {
        ReentrantLock lock1= new ReentrantLock();
        ReentrantLock lock2= new ReentrantLock();

        Runnable1 runnable1= new Runnable1(lock1,lock2);
        Runnable2 runnable2= new Runnable2(lock1,lock2);

        Thread thread1= new Thread(runnable1);
        Thread thread2= new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
