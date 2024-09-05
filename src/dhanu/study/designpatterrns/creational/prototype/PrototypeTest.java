package dhanu.study.designpatterrns.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.loadData();

        Employee emp1 = (Employee) emp.clone();
        Employee emp2 = (Employee) emp.clone();
    }
}
