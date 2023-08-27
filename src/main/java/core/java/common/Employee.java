package core.java.common;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public Integer id;
    public String name;
    public Double salary;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static List<Employee> getEmployeeList(){
        List<Employee> empList= new ArrayList<>();

        empList.add(new Employee(1,"B",20.0));
        empList.add(new Employee(2,"C",30.0));
        empList.add(new Employee(3,"A",15.0));

        return empList;
    }
}
