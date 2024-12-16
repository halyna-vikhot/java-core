package hw2.task3.models;

public class Papirus {
    private int size;

    public Papirus() {
    }

    public Papirus(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "size=" + size +
                '}';
    }
}
