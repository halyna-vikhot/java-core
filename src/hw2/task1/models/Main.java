package hw2.task1.models;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Max", "maximovich", "maxim@gmail.com",
                new Address("street55", "hdjs", "kyiv", "638",
                        new Geo()), "093667367", "usersite",
                new Company("company", "6826eh", "73" ));
        System.out.println(user1);
    }

}
