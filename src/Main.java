import hw1.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");

        Book[] books = new Book[]{
                new Book("book1", 100, new String[]{"author1", "author2", "author3"}, "comedy"),
                new Book("book2", 200, new String[]{"author1", "author2"}, "comedy"),
                new Book("book3", 300, new String[]{"author1"}, "comedy")
        };
        for (Book book : books) {
            System.out.println(book);
        }

        Car[] cars = new Car[]{
                new Car("Volvo", 200, 2.0, true),
                new Car("BMW", 200, 3.0, true),
                new Car("Audi", 180, 2.5, false),
        };
        for (Car car : cars) {
            System.out.println(car);
        }

        Comments[] comments = new Comments[]{
                new Comments(1, 1, "comment1", "com@gmail.com", "text"),
                new Comments(2, 2, "comment2", "com@gmail.com", "text"),
                new Comments(3, 3, "comment3", "com@gmail.com", "text"),
        };
        for (Comments comment : comments) {
            System.out.println(comment);
        }


        Dog[] dogs = new Dog[]{
                new Dog("Jeck",4, "German Shepherd"),
                new Dog("Pes",5, "Labrador"),
                new Dog("Baron",6, "Husky"),
        };
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Posts[] post = new Posts[]{
                new Posts(1,2 ,"title1", "some body"),
                new Posts(2,3 ,"title2", "some body"),
                new Posts(3,4 ,"title3", "some body"),
        };
        for (Posts posts : post) {
            System.out.println(posts);
        }
        };
    }




