package dhanu.study.designpatterrns.creational.abstactfactory;

public class Client {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PcFactory());
        Computer server = ComputerFactory.getComputer(new ServerFactory());
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory());

        System.out.println("PC Config " + pc);
        System.out.println("Server Config " + server);
        System.out.println("Laptop Config " + laptop);
    }
}
