package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles traveled: ");
        Double miles = input.nextDouble();
        System.out.println("Gas used (gallons): ");
        Double gas = input.nextDouble();
        input.close();
        double milesPerGallon = miles / gas;
        System.out.println(milesPerGallon);
    }
}
