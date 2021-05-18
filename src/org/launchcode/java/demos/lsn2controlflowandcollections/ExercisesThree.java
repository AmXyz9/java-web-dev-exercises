package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercisesThree {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for (int i : numbers) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String [] sentences = sentence.split("\\.");
        System.out.println(Arrays.toString(sentences));
        ArrayList<Integer> planets = new ArrayList<>();
        planets.add(23);
        planets.add(34);
        planets.add(0);
        planets.add(232);
        planets.add(45);
        planets.add(1);
        planets.add(90);
        planets.add(254);
        planets.add(76);
        planets.add(55);
        System.out.println(ExerciseThreeII.sumEven(planets));
    }
}
