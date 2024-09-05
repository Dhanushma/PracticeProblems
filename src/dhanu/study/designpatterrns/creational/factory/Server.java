package dhanu.study.designpatterrns.creational.factory;

public class Server extends Computer {

    private String cpu;
    private String ram;
    private String name;


    public Server(String cpu, String ram, String name) {
        this.cpu = cpu;
        this.ram = ram;
        this.name = name;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
