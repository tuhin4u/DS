package core.java.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class OddEvenPrinter{
    int count=1;
    int max=20;

    public void printOdd(){
        synchronized (this){
            while (count<max){
                while (count % 2==0){//if even
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+" : "+count);
                count++;
                this.notify();
            }
        }
    }

    public void printEven(){
        synchronized (this){
            while (count<max){
                while (count % 2==1){//if odd
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" : "+count);
                count++;
                this.notify();
            }
        }
    }
}

class OddEvenPrinterWithLock{
    int count=1;
    int max=20;
    Lock lock;
    Condition evenCondition;
    Condition oddCondition;
    //using condition only
    Condition condition;

    public OddEvenPrinterWithLock(Lock lock) {
        this.lock = lock;
//        this.evenCondition= lock.newCondition();
//        this.oddCondition= lock.newCondition();
        this.condition=lock.newCondition();
    }

    public void printOdd(){
            lock.lock();
            while (count<max){
                if (count % 2==0){//if even
                    try {
//                        this.wait();
//                        oddCondition.await();
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" : "+count);
                count++;
                condition.signal();
//                evenCondition.signal();
//                this.notify();
            }
            lock.unlock();
    }

    public void printEven(){
            lock.lock();
            while (count<max){
                if (count % 2==1){//if odd
                    try {
//                        this.wait();
//                        evenCondition.await();
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" : "+count);
                count++;
                condition.signal();
//                oddCondition.signal();
//                this.notify();
            }
            lock.unlock();
        }

}
//class MyThreadx implements Runnable{
//    OddEvenPrinter printer;
//
//    public MyThreadx(OddEvenPrinter printer) {
//        this.printer = printer;
//    }
//
//    @Override
//    public void run() {
//        printer.printOdd();
//    }
//}
public class OddEvenEx2 {
    public static void main(String[] args) {
        //OddEven Printer is working
//        OddEvenPrinter printer= new OddEvenPrinter();

        Lock lock= new ReentrantLock();
        OddEvenPrinterWithLock printer= new OddEvenPrinterWithLock(lock);

        Thread t1= new Thread(()->printer.printOdd());
        Thread t2= new Thread(()->printer.printEven());

        t1.start();
        t2.start();

    }
}
