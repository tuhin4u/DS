//package core.java.thread;
//
//
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//class ProducerConsumerWithLock{
//
//    Lock lock= new ReentrantLock();
//    Condition addCondition= lock.newCondition();
//    Condition removeCondition= lock.newCondition();
//
//    public void produce() throws InterruptedException {
//        lock.lock();
//        while (count==max){
//            removeCondition.await();
//        }
//
//
//        lock.unlock();
//    }
//
//}
//public class ProducerconsumerWithLockEx {
//}
