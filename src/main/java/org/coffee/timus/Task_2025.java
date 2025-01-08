package org.coffee.timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2025 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int c = in.nextInt();
            while (c > 0) {
                --c;
                int n = in.nextInt();
                int k = in.nextInt();

                int[] teams = new int[k];
                int team_size = n / k;
                int rest = n % k;
                for (int i = 0; i < k; ++i) {
                    if (rest > 0) {
                        --rest;
                        teams[i] = team_size + 1;
                    } else {
                        teams[i] = team_size;
                    }
                }

                int res = shutUpAndCalculate(teams);
                System.out.println(res);
            }
        }
    }

    public static int shutUpAndCalculate(int[] numbers) {
        int res = 0;
        int current_sum = numbers[0];

        for (int i = 1; i < numbers.length; ++i) {
            res += current_sum * numbers[i];
            current_sum += numbers[i];
        }

        return res;

    }

}
