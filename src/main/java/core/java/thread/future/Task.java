package core.java.thread.future;

import core.java.thread.future.server.Employee;
import core.java.thread.future.server.EmployeeDetailsServer;

import java.util.concurrent.Callable;

public class Task implements Callable<Employee>{
    EmployeeDetailsServer empServer=new EmployeeDetailsServer();
    @Override
    public Employee call() throws Exception {
        Thread.sleep(30000);
        return empServer.fetchEmployee();
    }
}
