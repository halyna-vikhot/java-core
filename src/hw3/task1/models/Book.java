package hw3.task1.models;

public class Book implements Printable{
    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Book" + this.name);
    }
}
