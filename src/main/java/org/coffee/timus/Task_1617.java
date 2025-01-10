package org.coffee.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1617 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            Map<Integer, Integer> wheels = new HashMap<>();
            while (n > 0) {
                --n;
                int inputWheel = in.nextInt();
                int wheelCount = wheels.getOrDefault(inputWheel, 0);
                wheels.put(inputWheel, wheelCount + 1);
            }

            int res = 0;
            for (int count: wheels.values()) {
                res += count / 4;
            }

            System.out.println(res);
        }
    }

}
