package uk.org.hexsaw.logactaesque.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dice implements Rollable {

    private List<Integer> faces;

    public Integer roll() {
        return faces.get(new Random().nextInt(faces.size()));
    }

    public Dice(Integer[] faces) {
        this.faces = Arrays.asList(faces);
    }
}
