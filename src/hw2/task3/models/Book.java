package hw2.task3.models;

public class Book extends Papirus{
    private int pages;

    public Book() {
    }

    public Book(int pages) {
        this.pages = pages;
    }

    public Book(int size, int pages) {
        super(size);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                "} " + super.toString();
    }
}
