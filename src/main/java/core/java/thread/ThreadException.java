package core.java.thread;

public class ThreadException {
    public static void main(String[] args) throws InterruptedException {
        ThreadEXceptionEx t=new ThreadEXceptionEx();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("from main thread "+i);
            if(i==5)
                Thread.sleep(100);
        }
    }
}
class ThreadEXceptionEx extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("from child thread "+i);
            if(i==5)
                throw new NullPointerException();
        }
    }
}
