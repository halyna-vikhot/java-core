package hw1;

import java.util.Arrays;

public class Book {
    private String title;
    private int pages;
    private String[] Authors;
    private String genre;

    public Book() {
    }

    public Book(String title, int pages, String[] authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.Authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String[] getAuthors() {
        return Authors;
    }

    public void setAuthors(String[] authors) {
        Authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", Authors=" + Arrays.toString(Authors) +
                ", genre='" + genre + '\'' +
                '}';
    }
}
