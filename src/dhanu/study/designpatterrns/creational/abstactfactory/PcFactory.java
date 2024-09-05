package dhanu.study.designpatterrns.creational.abstactfactory;

public class PcFactory implements ComputerAbstractFactory {
    @Override
    public Computer getComputer() {
        return new PC("9GB", "intel");
    }
}
