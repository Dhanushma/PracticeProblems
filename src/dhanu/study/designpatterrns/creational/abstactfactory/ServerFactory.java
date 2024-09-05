package dhanu.study.designpatterrns.creational.abstactfactory;

public class ServerFactory implements ComputerAbstractFactory {
    @Override
    public Computer getComputer() {
        return new Server("8GB", "hh");
    }
}
