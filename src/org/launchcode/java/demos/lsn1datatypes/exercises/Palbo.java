package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class Palbo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width: ");
        Double width = input.nextDouble();
        System.out.println("Enter height: ");
        Double height = input.nextDouble();
        input.close();
        double area = width*height;
        System.out.println("The rectangle has an area of " + area + " square units.");
    }
}
