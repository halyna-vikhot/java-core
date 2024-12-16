package hw2.task3.models;

public class Comics extends Book{
    private int number;

    public Comics() {
    }

    public Comics(int number) {
        this.number = number;
    }

    public Comics(int pages, int number) {
        super(pages);
        this.number = number;
    }

    public Comics(int size, int pages, int number) {
        super(size, pages);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "number=" + number +
                "} " + super.toString();
    }
}
