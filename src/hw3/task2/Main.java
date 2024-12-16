package hw3.task2;

import hw3.task2.models.Drum;
import hw3.task2.models.Guitar;
import hw3.task2.models.Instrument;
import hw3.task2.models.Trumplet;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instrument> instruments = Arrays.asList(
                new Drum(25),
                new Guitar(5),
                new Trumplet(25.8)
        );
        for (Instrument instrument: instruments){
            instrument.play();
        }
    }
}
