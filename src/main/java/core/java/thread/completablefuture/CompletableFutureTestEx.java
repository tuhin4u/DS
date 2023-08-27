package core.java.thread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTestEx {
    public static void main(String[] args) {
        System.out.println("main thread execution started");
        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return 5;
        });

        integerCompletableFuture.thenAcceptAsync(x->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("value of x:"+x);
            System.out.println(x*2);
        });
        System.out.println("main thread execution ends");

    }
}
