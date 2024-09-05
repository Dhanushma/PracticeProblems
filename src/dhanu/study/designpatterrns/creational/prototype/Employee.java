package dhanu.study.designpatterrns.creational.prototype;

public class Employee implements Cloneable{

    private String name;
    private String id;
    private String position;

    public Employee() {
    }

    public Employee(String name, String id, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public void loadData(){
        setId("123");
        setName("Dhanus");
        setPosition("Developer");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Object clone() {
        return new Employee(this.name, this.id, this.position);
    }
}
