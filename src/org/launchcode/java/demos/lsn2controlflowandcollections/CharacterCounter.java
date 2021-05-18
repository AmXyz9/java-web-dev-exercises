package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] quoteCharacters = quote.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < quoteCharacters.length; i++) {
            char characterCurrent = quoteCharacters[i];
            int total = 0;
            for (Character character: quoteCharacters) {
                if (character == characterCurrent) {
                    total += 1;
                }
            }
            characters.put(characterCurrent, total);
        }
        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ":" + character.getValue());
        }
    }
}
