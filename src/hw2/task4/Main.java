package hw2.task4;

import hw2.task4.enums.Gender;
import hw2.task4.models.Car;
import hw2.task4.models.Skill;
import hw2.task4.models.User;

public class Main {
    public static void main(String[] args) {
        User user2 = new User(1, "Oleg", "oleg@gmail.com", 30, Gender.MALE,
                new Car("Audi", 2010, 200 ));

        user2.getSkills().add(new Skill("java", 3));
        user2.getSkills().add(new Skill("jі", 2));
        user2.getSkills().add(new Skill("python", 1));


        System.out.println(user2);



    }
}
