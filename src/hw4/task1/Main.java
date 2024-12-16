package hw4.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Irina", 18),
                new User("Bogdan", 19),
                new User("Ivan", 20),
                new User("Semen", 25)
        );

        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);

        users.sort((User u1, User u2) -> u2.getAge() - u1.getAge());
        System.out.println(users);
        List<String> words = Arrays.asList(
                "Irina", "Bogdan", "Ivan", "Semen"
        );
//        words.sort((String s, String t1) -> s.compareTo(t1));
        words.sort(String :: compareTo);
        System.out.println(words);
//        words.sort((String u1, String u2) -> u1.length() - u2.length());
        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);

    }
}
