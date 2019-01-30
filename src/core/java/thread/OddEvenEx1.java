package core.java.thread;

import sun.font.TrueTypeFont;

/**
 * odd even from two thread
 * if flag is True print odd, else print False.
 */

class OddPrinter implements Runnable{
    int sharedNumber;
    Boolean flag;
    int limit;

    public OddPrinter(int sharedNumber, int limit, Boolean flag) {
        this.sharedNumber = sharedNumber;
        this.flag = flag;
        this.limit=limit;
    }

    @Override
    public void run() {
        //if flag==true the print
        synchronized (flag){
            if(flag== true){
                if(sharedNumber<limit){
                    System.out.println(Thread.currentThread().getName()+" "+sharedNumber);
                    sharedNumber++;
                    flag=Boolean.FALSE;
                    flag.notifyAll();
                }
            }else{
                try {
                    flag.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
class EvenPrinter implements Runnable{
    int sharedNumber;
    int limit;
    Boolean flag;

    public EvenPrinter(int sharedNumber,int limit, Boolean flag) {
        this.sharedNumber = sharedNumber;
        this.flag = flag;
        this.limit=limit;
    }

    @Override
    public void run() {
        //if flag==true the print
        synchronized (flag){
            if(flag== false){
                if(sharedNumber<limit){
                    System.out.println(Thread.currentThread().getName()+" "+sharedNumber);
                    sharedNumber++;
                    flag=Boolean.FALSE;
                    flag.notifyAll();
                }
            }else{
                try {
                    flag.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

public class OddEvenEx1 {
    public static void main(String[] args) {
        Integer i=new Integer(1);
        Boolean flag=true;

        Thread odd=new Thread(new OddPrinter(i,10,flag),"ODD");
        Thread even=new Thread(new OddPrinter(i,10,flag),"EVEN");

        odd.start();
        even.start();

    }
}
