package interviewTest.test12;


import java.util.HashMap;
import java.util.Map;

/*
* He was  able to explain  how to sort employee hashmap based on employee name. Here Employee class is having multiple fields like id, name and salary.
* Hashmap key is employee id and value is employee Object.
105, "AMAR", 2000
103  "BHASKAR", 1500
101, "CHETAN", 3000

*
* */
class  Employee implements Comparable<Employee>{
    Integer id;
    String name;
    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
public class Test {
    public static void main(String[] args) {
        Map<Integer,Employee> map= new HashMap<>();
        map.put(1,new Employee("B",10d));
        map.put(2,new Employee("A",10d));
        map.put(3,new Employee("C",10d));
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x-> System.out.println(x.getValue().name));
    }
}
