package dhanu.study.designpatterrns.creational.Builder;

public class Computer {

    private String name;
    private String cpu;
    private String ram;

    // optional
    private String hasKeyBoard;
    private String hasSpeaker;

    private Computer(ComputerBuilder computerBuilder){
        this.cpu = computerBuilder.cpu;
        this.name = computerBuilder.name;
        this.ram = computerBuilder.ram;
        this.hasKeyBoard = computerBuilder.hasKeyBoard;
        this.hasSpeaker = computerBuilder.hasSpeaker;
    }



    public static class ComputerBuilder {

        private String name;
        private String cpu;
        private String ram;

        // optional
        private String hasKeyBoard;
        private String hasSpeaker;

        public ComputerBuilder(String name, String cpu, String ram) {
            this.cpu = cpu;
            this.name = name;
            this.ram = ram;
        }

        public ComputerBuilder setHasKeyBoard(String hasKeyBoard) {
            this.hasKeyBoard = hasKeyBoard;
            return this;
        }

        public ComputerBuilder setHasSpeaker(String hasSpeaker) {
            this.hasSpeaker = hasSpeaker;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
