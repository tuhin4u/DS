package myjava8.module2.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceEx {
    static  class Emp{
        public String name;
        public int sal;

        public Emp(String name, Integer sal) {
            this.name = name;
            this.sal = sal;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", sal=" + sal +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Emp> empList= new ArrayList<>(Arrays.asList(new Emp[]{new Emp("A",30), new Emp("B",40), new Emp("C",35)}));

//        Optional<Integer> total_salary = empList.stream().map(x -> x.sal).reduce((x, y) -> x + y);
//        System.out.println(total_salary.get());

        Integer total_salary = empList.parallelStream().map(x -> x.sal).reduce(0,(x, y) -> x+y,Integer::sum);
        System.out.println(total_salary);
    }
}
