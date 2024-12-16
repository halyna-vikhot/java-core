package hw2.task3.models;

public class Magazine extends Book{
    private double thickness;

    public Magazine() {
    }

    public Magazine(double thickness) {
        this.thickness = thickness;
    }

    public Magazine(int pages, double thickness) {
        super(pages);
        this.thickness = thickness;
    }

    public Magazine(int size, int pages, double thickness) {
        super(size, pages);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "thickness=" + thickness +
                "} " + super.toString();
    }
}
