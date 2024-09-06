package dhanu.study.designpatterrns.structural.adapter;

public class SquarePegAdapter extends RoundPeg {

    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg peg) {
        this.squarePeg = peg;
    }

      @Override
      public double getRadius() {
          return Math.sqrt(Math.pow(squarePeg.width, 2) * 2);

    }
}
