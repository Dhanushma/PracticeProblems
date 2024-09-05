package dhanu.study.designpatterrns.creational.factory;

public abstract class Computer {

    public abstract String getCpu();
    public abstract String getRam();
    public abstract String getName();

    @Override
    public String toString() {
        return "Ram:" + getRam() + " Cpu:" + getCpu() + " Name:" + getName();
    }
}
