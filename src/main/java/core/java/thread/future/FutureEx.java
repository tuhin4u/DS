package core.java.thread.future;

import core.java.thread.future.server.Employee;
import sun.net.www.http.HttpClient;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Employee> future = executorService.submit(new Task());
        Employee employee = future.get();
        System.out.println(employee);
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }


    }
}
