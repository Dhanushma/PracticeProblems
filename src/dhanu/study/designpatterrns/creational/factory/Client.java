package dhanu.study.designpatterrns.creational.factory;

public class Client {

    public static void main(String[] args) {


        Computer pc = ComputerFactory.getComputer("PC", "intel", "8GB", "windows");
        Computer server = ComputerFactory.getComputer("SERVER", "xxx", "yy", "Tomcat");

        System.out.println("PC Details, " + pc);
        System.out.println("Server Details, " + server);
    }
}
