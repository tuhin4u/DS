package core.java.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<Integer> q=new ArrayBlockingQueue<Integer>(10);

        final Runnable producer=()->{
            while (true){
                try {
                    q.put(1);
                    System.out.println("producer thread-> queue size"+q.size());
//                    if(q.size()==10){
//                        System.out.println("producer thread-> queue is full");
//                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        final Runnable consumer=()->{
            while(true){
                try {
                    Integer i = q.take();
                    System.out.println("consumer thread-> queue size"+q.size()+" consumed:"+i);
//                    if(q.size()==0){
//                        System.out.println("consumer thread-> queue is empty");
//                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        //creating produce thread
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
