package core.java.thread;

class OddPrinter implements Runnable{
    Container container;
    int limit;

    public OddPrinter(Container c, int limit) {
        this.container = c;
        this.limit=limit;
    }

    @Override
    public void run() {
        while (true){
            printOdd();
        }
    }
    void printOdd(){
        if(container.get()%2!=0 && container.get()<=limit){
            synchronized (container){

                System.out.println("Odd->"+container.get());
                container.increment();
                container.notifyAll();
            }
        }
        /*synchronized (container){
            try {
                container.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }
}
class EvenPrinter implements Runnable{
    Container container;
    int limit;

    public EvenPrinter(Container c, int limit) {
        this.container = c;
        this.limit=limit;
    }

    @Override
    public void run() {
        while (true){
            printEven();
        }
    }
    void printEven(){
        if(container.get()%2==0 && container.get()<=limit){
            synchronized (container){
                System.out.println("Even->"+container.get());
                container.increment();
                container.notifyAll();
            }
        }
        /*synchronized (container){
            try {
                container.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }
}

public class OddEvenEx1 {
    public static void main(String[] args) {
        Integer i=new Integer(1);
        Container c=new Container(i);

        Thread odd=new Thread(new OddPrinter(c,10));
        Thread even=new Thread(new EvenPrinter(c,10));

        odd.start();
        even.start();

    }
}
class Container{
    public  Integer i;

    public Container(Integer i) {
        this.i = i;
    }
    public  int increment(){
        return i++;
    }
    public  int get(){
        return i;
    }
}