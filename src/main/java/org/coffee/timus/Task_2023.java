package org.coffee.timus;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class Task_2023 {

    public static int[][] paths = new int[3][3];
    static {
        paths[0][1] = 1;
        paths[0][2] = 2;
        paths[1][2] = 1;
        paths[1][0] = 1;
        paths[2][0] = 2;
        paths[2][1] = 1;
    }

    public static Map<Integer, Set<Character>> boxes = new HashMap<>();
    static {
        boxes.put(0, new HashSet<>(Arrays.asList('A', 'P', 'O', 'R')));
        boxes.put(1, new HashSet<>(Arrays.asList('B', 'M', 'S')));
        boxes.put(2, new HashSet<>(Arrays.asList('D', 'G', 'J', 'K', 'T', 'W')));
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();
            int currentPosition = 0;
            int result = 0;

            while (n > 0) {
                --n;
                String name = in.nextLine();
                char firstCharacter = name.charAt(0);
                int whereToGo = whereToGo(firstCharacter);
                result += paths[currentPosition][whereToGo];
                currentPosition = whereToGo;
            }

            System.out.println(result);

        }
    }

    public static int whereToGo(char firstCharacter) {
        for (Map.Entry<Integer, Set<Character>> entry: boxes.entrySet()) {
            if (entry.getValue().contains(firstCharacter)) {
                return entry.getKey();
            }
        }

        throw new IllegalArgumentException("Unknown character + '" + firstCharacter + "'");
    }

}
