package dhanu.study.designpatterrns.creational.factory;

public class ComputerFactory {

    public static Computer getComputer( String type, String cpu, String ram, String name) {

       return type.equals("PC") ?  new PC(cpu, ram, name) : new Server(cpu, ram, name);
    }
}
