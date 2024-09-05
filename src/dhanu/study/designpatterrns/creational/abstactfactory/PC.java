package dhanu.study.designpatterrns.creational.abstactfactory;

public class PC extends Computer{

    private String ram;
    private String cpu;

    public PC(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
}
