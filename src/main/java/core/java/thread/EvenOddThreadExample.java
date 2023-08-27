package core.java.thread;

public class EvenOddThreadExample {
    private static final int MAX_COUNT = 10;
    private static int count = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        evenThread.start();
        oddThread.start();
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.println("Even: " + count);
                        count++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 != 0) {
                        System.out.println("Odd: " + count);
                        count++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
