package dhanu.study.designpatterrns.creational.Builder;


public class TestBuilder {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("PC", "MP", "intel")
                .setHasKeyBoard("yes").build();
    }
}
