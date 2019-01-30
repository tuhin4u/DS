package core.java.thread;

import java.util.Vector;

/**
 * Created by U6042192 on 01-Nov-17.
 */
class Producer implements  Runnable{
    public Vector<Integer> sharedQueue;
    public int size;

    public Producer(Vector<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            produce(i);
        }
    }

    private void produce(int i) {
        //check if the queue is full then wait
        if(sharedQueue.size()==size){
            synchronized (sharedQueue){
                try {
                    System.out.println("Queue is full " + Thread.currentThread().getName()
                            + " is waiting , size: " + sharedQueue.size());
                    sharedQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        //if queue is not empty then produce int the queue
        synchronized (sharedQueue){
            sharedQueue.add(i);
            System.out.println(Thread.currentThread().getName()+" is producing "+i);
            sharedQueue.notifyAll();
        }
    }

}
class Consumer implements Runnable{
    public Vector<Integer> sharedQueue;
    public int size;

    public Consumer(Vector<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }


    @Override
    public void run() {
        while (true){
            System.out.println("Consumed: "+consume());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int consume() {

        //check if the queue is empty then wait
        synchronized (sharedQueue){
            if(sharedQueue.isEmpty()){
                try {
                    System.out.println("Queue is full " + Thread.currentThread().getName()
                            + " is waiting , size: " + sharedQueue.size());
                    sharedQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        //if queue is not empty the consume
        synchronized (sharedQueue){
            sharedQueue.notifyAll();
            return sharedQueue.remove(0);
        }
    }
}
public class ProducerConsumerEx1 {
    public static void main(String[] args) {
        Vector<Integer> sharedQueue=new Vector<>();
        Thread producerThred=new Thread(new Producer(sharedQueue,4),"Producer");
        Thread consumerThred=new Thread(new Consumer(sharedQueue,4),"Consumer");

        producerThred.start();
        consumerThred.start();
    }
}
