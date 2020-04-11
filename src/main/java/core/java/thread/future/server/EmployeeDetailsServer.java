package core.java.thread.future.server;

import java.util.Arrays;
import java.util.List;

public class EmployeeDetailsServer {
    List<Employee> employeeList= Arrays.asList(new Employee("1","A"),new Employee("2","B"));

    public List<Employee> fetchEmployeeList(){
        return employeeList;

    }
    public Employee fetchEmployee(){
        return employeeList.get(0);
    }
}
