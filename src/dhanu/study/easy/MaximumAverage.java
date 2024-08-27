package dhanu.study.easy;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumAverage {
    public static void main(String[] args) {
        Employee em1 = new Employee("Alia",-678);
        Employee em2 = new Employee("Bobby",100);
        Employee em3 = new Employee("Alex",223);
        Employee em4 = new Employee("Alex",-23);
        Employee em5 = new Employee("Bobby",723);

        List<Employee> employeeList = Arrays.asList(em1, em2, em3, em4, em5);
        System.out.println(findMaxAvg(employeeList));
    }

    // Given an array of Employees with name,marks.
    // Find out the maximum average marks from the list.{"Alia","-678"},
    //{"Bobby","100"},
    //{"Alex","223"},
    //{"Alex","-23"},
    //{"Bobby","723"}
    //};
    //Avg Bobby = 315,Alex= 100,Alia=-678. Result: 315

    public static class Employee {
        private String name;
        private int mark;

        public Employee(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }

        public String getName() {
            return name;
        }

        public int getMark() {
            return mark;
        }
    }

    public static double findMaxAvg(List<Employee> employeeList) {

        Map<String, Double> map = employeeList.stream().collect(Collectors
                .groupingBy(Employee::getName, Collectors.averagingDouble(Employee::getMark)));

        System.out.println(map);

        return map.values().stream().sorted((a, b) -> Double.compare(b, a))
                .findFirst().orElse(Double.NaN);
    }

}
