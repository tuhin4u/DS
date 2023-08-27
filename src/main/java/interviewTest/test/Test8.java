package interviewTest.test;

import java.util.HashMap;
import java.util.Map;

public class Test8 {
    public static void main(String[] args) {
        Object obj;
        Employee e1=new Employee(1,"a");
        Employee e2=new Employee(1,"a");
        System.out.println("equals = "+e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        Map<Employee,String> map=new HashMap<>();
        map.put(e1,"x");
        map.put(e2,"y");

        System.out.println(map.size());
        System.out.println(map.get(e2));
    }
    //in this case e1->e2 are in the same bucket,get calls equal,of object class if we dont override
    //object class equals() is for reference comparison. same as ==
}
class Employee{
    Integer id;
    String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /*@Override
    public int hashCode() {
        return 1;
    }*/

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
