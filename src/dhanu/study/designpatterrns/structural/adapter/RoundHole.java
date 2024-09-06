package dhanu.study.designpatterrns.structural.adapter;

public class RoundHole {

    double radius;

    public RoundHole() {

    }

    public RoundHole(double radius){
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return peg.getRadius() <= radius;
    }
}
