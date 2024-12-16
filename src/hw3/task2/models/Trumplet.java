package hw3.task2.models;

public class Trumplet implements Instrument {
    private double diameter;

    public Trumplet() {
    }

    public Trumplet(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Trumplet{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " " + this.diameter + "diameter" );
    }
}
