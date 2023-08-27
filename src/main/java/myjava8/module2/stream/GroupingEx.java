package myjava8.module2.stream;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingEx {


    public static void main(String[] args) {
        List<Employee> list = GroupingEx.Employee.getAllEmployees();
        System.out.println(list);

        //group all the employe based upon country
        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(x -> x.country));
        System.out.println(collect);

        //grouping with multiple condition
        Map<String, Map<Double, List<Employee>>> collect1 = list.stream()
                .collect(Collectors.groupingBy(x -> x.country, Collectors.groupingBy(x -> x.salary)));
        System.out.println(collect1);

        //group by country and sum of salary
        Map<String, Double> collect2 = list.stream().collect(Collectors.groupingBy(x -> x.country, Collectors.summingDouble(x -> x.salary)));
        System.out.println(collect2);

        //prtition by
        Map<Boolean, List<Employee>> collect3 = list.stream().collect(Collectors.partitioningBy(x -> x.salary > 30));
        System.out.println(collect3);

        Collections.sort(list, Comparator.comparing(x->x.salary));
        System.out.println(list);

    }

    static class Employee {

        public String name;
        public int id;
        public String country;
        public double salary;

        public Employee(String name, int id, String country, double salary) {
            this.name = name;
            this.id = id;
            this.country = country;
            this.salary = salary;
        }

        public static List<Employee> getAllEmployees() {
            List<Employee> list = new ArrayList<>();
            list.add(new Employee("A", 1, "IN", 30));
            list.add(new Employee("B", 2, "CA", 40));
            list.add(new Employee("C", 3, "IN", 30));
            list.add(new Employee("D", 4, "CA", 60));
            list.add(new Employee("E", 5, "US", 70));

            return list;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", country='" + country + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
