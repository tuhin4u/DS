package core.java.thread;

import java.util.Vector;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Producer1 implements Runnable {
    private Vector<Integer> sharedQueue;
    private int size;
    private Lock lock;
    private Condition notFull;
    private Condition notEmpty;

    public Producer1(Vector<Integer> sharedQueue, int size, Lock lock, Condition notFull, Condition notEmpty) {
        this.sharedQueue = sharedQueue;
        this.size = size;
        this.lock = lock;
        this.notFull = notFull;
        this.notEmpty = notEmpty;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            produce(i);
        }
    }

    private void produce(int i) {
        lock.lock();
        try {
            while (sharedQueue.size() == size) {
                System.out.println("Queue is full " + Thread.currentThread().getName() +
                        " is waiting , size: " + sharedQueue.size());
                notFull.await();
            }
            sharedQueue.add(i);
            System.out.println(Thread.currentThread().getName() + " is producing " + i);
            notEmpty.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class Consumer1 implements Runnable {
    private Vector<Integer> sharedQueue;
    private int size;
    private Lock lock;
    private Condition notFull;
    private Condition notEmpty;

    public Consumer1(Vector<Integer> sharedQueue, int size, Lock lock, Condition notFull, Condition notEmpty) {
        this.sharedQueue = sharedQueue;
        this.size = size;
        this.lock = lock;
        this.notFull = notFull;
        this.notEmpty = notEmpty;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Consumed: " + consume());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int consume() {
        lock.lock();
        try {
            while (sharedQueue.isEmpty()) {
                System.out.println("Queue is empty " + Thread.currentThread().getName() +
                        " is waiting , size: " + sharedQueue.size());
                notEmpty.await();
            }
            int item = sharedQueue.remove(0);
            notFull.signalAll();
            return item;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        } finally {
            lock.unlock();
        }
    }
}

public class ProducerConsumerWithLockEx {
    public static void main(String[] args) {
        Vector<Integer> sharedQueue = new Vector<>();
        Lock lock = new ReentrantLock();
        Condition notFull = lock.newCondition();
        Condition notEmpty = lock.newCondition();

        Thread Producer1Thread = new Thread(new Producer1(sharedQueue, 4, lock, notFull, notEmpty), "Producer1 ");
        Thread Consumer1Thread1 = new Thread(new Consumer1(sharedQueue, 4, lock, notFull, notEmpty), "Consumer1 ");

        Producer1Thread.start();
        Consumer1Thread1.start();
    }
}


