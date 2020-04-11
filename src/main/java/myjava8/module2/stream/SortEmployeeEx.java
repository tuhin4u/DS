package myjava8.module2.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by u6042192 on 08-Apr-19.
 */

public class SortEmployeeEx {


    public static void main(String[] args) {
        List<Employee> l=new ArrayList<>();
        l.add(new Employee(2,"B",20000.00));
        l.add(new Employee(1,"A",10000.00));
        l.add(new Employee(4,"C",40000.00));
        l.add(new Employee(3, "D", 30000.00));

        //count the no of employee
        long total=l.stream().count();
        System.out.println("total employee= " + total);
        long n=l.stream().filter(e->e.salary>20000).collect(Collectors.toList()).stream().count();
        System.out.println(n);

        l.sort((x, y) -> x.salary.compareTo(y.salary));
//        l.sort((x, y) -> x.name.compareTo(y.name));
        System.out.println(l);

        //iteration over map
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.forEach((k,v)-> System.out.println("key: "+k+"value: "+v));

    }

}
class Employee{
    int id;
    String name;
    Double salary;

    public Employee(int id, String name, Double salary) {
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
}
