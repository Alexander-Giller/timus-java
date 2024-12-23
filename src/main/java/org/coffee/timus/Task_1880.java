package org.coffee.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * It's not the fastest solution, but mostly academic with different structures.
 */
public class Task_1880 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Map<Integer, Integer> numbersMap = new HashMap<>();

            final int teamSize = 3;

            for (int i = 0; i < teamSize; ++i) {
                int numberCount = in.nextInt();
                while (numberCount > 0) {
                    --numberCount;
                    int number = in.nextInt();
                    Integer count = numbersMap.get(number);
                    if (count == null) {
                        numbersMap.put(number, 1);
                    } else {
                        numbersMap.put(number, count + 1);
                    }
                }
            }

            int result = (int) numbersMap.entrySet().stream()
                    .filter(entry -> entry.getValue() == teamSize)
                    .count();
            System.out.println(result);

        }
    }

}
