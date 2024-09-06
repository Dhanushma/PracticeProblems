package dhanu.study.designpatterrns.structural.adapter;

public class SquarePeg {

    double width;

    public SquarePeg(){}

    public SquarePeg(double width){
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        return Math.pow(width, 2);
    }
}
