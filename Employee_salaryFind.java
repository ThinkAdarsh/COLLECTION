package StreamApi_Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee_salaryFind {

    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee(1, "adarsh", 40000D));
        employeeList.add(new Employee(2, "ssss", 20000D));
        employeeList.add(new Employee(3, "ddd", 30000D));
        employeeList.add(new Employee(4, "kkk", 10000D));

        List<Employee> emp=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        emp.forEach(System.out::println);

        System.out.println(emp.get(emp.size()-2));

        Stream<Employee> stream= employeeList.stream();
        System.out.println("the count of salary is ====="+stream.count());

        Employee employee= employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(employee);

        Employee employee1= employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(employee1);



    }
}
