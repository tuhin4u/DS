package core.java.thread.ForkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class FibonaciEx{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Fibonaci f=new Fibonaci(10);
        ForkJoinPool fjp=new ForkJoinPool(2);
        while (true){

            Integer i = fjp.invoke(f);
            System.out.println(i);
        }


    }
}

class Fibonaci extends RecursiveTask<Integer>{
    final int n;
    Fibonaci(int n) {this.n=n;}
    public int getNumber(){
        return n;
    }
    @Override
    public Integer compute() {
        if(n<=1)
            return n;
        Fibonaci f1=new Fibonaci(n-1);
        f1.fork();
        Fibonaci f2=new Fibonaci(n-2);
        f2.fork();

        return f1.join()+f2.join();
    }
}
