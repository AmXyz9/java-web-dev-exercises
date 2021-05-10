package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Wonder {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        alice = alice.toLowerCase(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term:");
        String search = input.nextLine();
        search = search.toLowerCase(Locale.ROOT);
        boolean wordPresent = alice.contains(search);
        System.out.println(wordPresent);
        Integer index = alice.indexOf(search);
        Integer length = search.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = alice.replace(search, "");
        System.out.println(modifiedSentence);
    }
}
