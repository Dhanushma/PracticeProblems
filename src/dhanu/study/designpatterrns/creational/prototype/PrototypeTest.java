package dhanu.study.designpatterrns.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.loadData();

        Employee emp1 = (Employee) emp.clone();
        Employee emp2 = (Employee) emp.clone();

        emp1.setName("Maya");
        emp2.setName("Rahul");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp);
    }
}
