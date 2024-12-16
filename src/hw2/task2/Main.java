package hw2.task2;

import hw2.task2.models.Laptop;
import hw2.task2.models.Ultrabook;
import hw2.task2.models.WorkStation;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(9, 9, 15.5, 3);
        Ultrabook ultrabook = new Ultrabook(8, 20, 21.5, 30, 2);
        WorkStation workStation = new WorkStation(30, 34, 34,40, "Card");

        System.out.println(laptop);
        System.out.println(ultrabook);
        System.out.println(workStation);
    }
}
