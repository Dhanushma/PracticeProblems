package dhanu.study.designpatterrns.creational.abstactfactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.getComputer();
    }
}
