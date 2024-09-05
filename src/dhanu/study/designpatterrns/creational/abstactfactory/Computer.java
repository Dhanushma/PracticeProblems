package dhanu.study.designpatterrns.creational.abstactfactory;

public abstract class Computer {

    public abstract String getRam();
    public abstract String getCpu();


    @Override
    public String toString() {
        return "Ram: " + getRam() + " CPU: " + getCpu();
    }
}
