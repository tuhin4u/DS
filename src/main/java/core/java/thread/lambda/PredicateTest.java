package core.java.thread.lambda;



import core.java.common.Employee;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class EmployeeAgePredicate implements Predicate<Employee>{
    @Override
    public boolean test(Employee employee) {
        if (employee.id < 100)
            return false;
        return true;
    }

    public boolean isValidEmployeeId(Predicate<Employee> empPred, Employee e){
        return empPred.test(e);
    }
}


public class PredicateTest {
    public static void main(String[] args) {
//        Employee e= new Employee(100,"A",20.0);
//        Predicate<Employee> epred=x->x.id>10;
//        EmployeeAgePredicate employeeAgePredicate= new EmployeeAgePredicate();
//        boolean validEmployeeId = employeeAgePredicate.isValidEmployeeId(epred, e);
//        System.out.println(validEmployeeId);
//
//        List<Employee> employeeList = Employee.getEmployeeList();
//        List<Integer> collect = employeeList.stream().mapToInt(x -> x.id).boxed().collect(Collectors.toList());
//        System.out.println(collect);
//        OptionalInt average = employeeList.stream().mapToInt(x -> x.id).min();
//        System.out.println(average.getAsInt());
//
//        Optional<Employee> max = employeeList.stream().max((x, y) -> x.salary.compareTo(y.salary));
//        if(max.isPresent()){
//            System.out.println(max.get());
//        }
//
//        Optional<Double> reduce = employeeList.stream().map(x -> x.salary).reduce((x, y) -> x + y);
//
//
//        Double collect1 = employeeList.stream().collect(Collectors.averagingInt(x->x.id));
//        Long collect2 = employeeList.stream().collect(Collectors.counting());
//        System.out.println(collect2);


        //word count
        List<String> words = Arrays.asList(new String[]{"cat", "dog", "cat", "horse"});

//        Map<String, Integer> wordmap = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.summingInt(w -> 1)));
//        System.out.println(wordmap);


        class CountryEmp{
            String country;
            String name;

            public CountryEmp(String country, String name) {
                this.country = country;
                this.name = name;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        List<CountryEmp> ls= Arrays.asList(new CountryEmp[]{new CountryEmp("India","A"), new CountryEmp("India","B"), new CountryEmp("usa","C")});
        Map<String, List<String>> countryEmpMap = ls.stream().collect(Collectors.groupingBy(x -> x.country, Collectors.mapping(x -> x.name, Collectors.toList())));
        System.out.println(countryEmpMap);


    }
}
