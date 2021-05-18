package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;

public class ExerciseThreeII {

    public static int sumEven(ArrayList<Integer> planets) {
        int total = 0;
        for (int integer : planets) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
