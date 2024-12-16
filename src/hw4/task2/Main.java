package hw4.task2;

import hw2.task4.enums.Gender;
import hw4.task2.models.Car;
import hw4.task2.models.Skill;
import hw4.task2.models.User;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        users.add(new User(1, "Ivanov", "ivanov@gmail.com", 25, Gender.MALE, new Car("BMW", 2010, 200)));
        users.add(new User(2, "Irina", "irina@gmail.com", 24, Gender.FEMALE,
                new Car("Audi", 2000, 100)));
        users.add(new User(3, "Popov", "popov@gmail.com", 30, Gender.MALE,
                new Car("Nissan", 2011, 200)));
        users.add(new User(4, "Yana", "yana@gmail.com", 22, Gender.FEMALE,
                new Car("Mercedes", 2005, 150)));

        users.removeIf(user -> user.getGender() == Gender.MALE);
        System.out.println(users);

        TreeSet<User> usersSorted = new TreeSet<>();
        User user1 = new User(1, "Ivanov", "ivanov@gmail.com", 25, Gender.MALE,
                new Car("BMW", 2010, 200));

        user1.getSkills().add(new Skill("java", 5));

        User user2 = new User(2, "Irina", "irina@gmail.com", 24, Gender.FEMALE,
                new Car("Audi", 2000, 100));
        user2.getSkills().add(new Skill("js", 6));
        user2.getSkills().add(new Skill("python", 5));


        User user3 = new User(3, "Popov", "popov@gmail.com", 30, Gender.MALE,
                new Car("Nissan", 2011, 200));
        user3.getSkills().add(new Skill("html", 5));
        user3.getSkills().add(new Skill("css", 6));
        user3.getSkills().add(new Skill("python", 5));

        User user4 = new User(4, "Yana", "yana@gmail.com", 22, Gender.FEMALE,
                new Car("Mercedes", 2005, 150));
        user4.getSkills().add(new Skill("js", 6));
        user4.getSkills().add(new Skill("python", 5));
        user4.getSkills().add(new Skill("css", 6));
        user4.getSkills().add(new Skill("python", 5));


        usersSorted.add(user1);
        usersSorted.add(user2);
        usersSorted.add(user3);
        usersSorted.add(user4);

        usersSorted.forEach(System.out ::println);



    }
}
