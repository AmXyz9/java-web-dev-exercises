package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseThreeIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        words.add("balls");
        words.add("cube");
        words.add("bazooka");
        words.add("fallow");
        words.add("frank");
        Integer length;
        System.out.println("How many characters long? ");
        length = input.nextInt();
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
