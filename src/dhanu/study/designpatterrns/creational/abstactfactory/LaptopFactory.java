package dhanu.study.designpatterrns.creational.abstactfactory;

public class LaptopFactory implements ComputerAbstractFactory{
    @Override
    public Computer getComputer() {
        return new Laptop("16GB", "intel");
    }
}
