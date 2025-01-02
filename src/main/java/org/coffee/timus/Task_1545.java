package org.coffee.timus;

import java.util.*;

public class Task_1545 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();

            Map<Character, Set<String>> recommends = new HashMap<>();

            while (n > 0) {
                --n;
                String word = in.nextLine();
                char symbol = word.charAt(0);
                Set<String> recommendsForCharacter = recommends.getOrDefault(symbol, new HashSet<>());
                recommendsForCharacter.add(word);
                recommends.put(symbol, recommendsForCharacter);
            }

            char inputChar = in.nextLine().charAt(0);
            for (String word: recommends.getOrDefault(inputChar, new HashSet<>())) {
                System.out.println(word);
            }

        }
    }

}
