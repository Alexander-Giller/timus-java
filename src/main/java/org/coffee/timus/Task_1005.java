package org.coffee.timus;

import java.util.Scanner;

public class Task_1005 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            boolean[] startPosition = new boolean[n];
            int[] values = new int[n];
            for (int i = 0; i < n; ++i) {
                values[i] = in.nextInt();
            }

            int min = Integer.MAX_VALUE;

            while (addOne(startPosition)) {
                int left = 0;
                int right = 0;
                for (int i = 0; i < n; ++i) {
                    if (startPosition[i]) {
                        left += values[i];
                    } else {
                        right += values[i];
                    }
                }

                int currentMin = Math.abs(left - right);
                if (min > currentMin) {
                    min = currentMin;
                }
            }

            System.out.println(min);
        }
    }


    public static boolean addOne(boolean[] input) {
        for (int i = 0; i < input.length; ++i) {
            if (input[i]) {
                input[i] = false;
            } else {
                input[i] = true;
                return true;
            }
        }

        return false;
    }

}
