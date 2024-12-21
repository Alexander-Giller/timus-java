package org.coffee.timus;

import java.util.Scanner;

public class Task_1820 {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt(); // order
            int k = in.nextInt(); // pan capacity

            int res;
            if (n <= k) {
                res = 2;
            } else {
                int sides = n * 2;
                res = sides / k;
                if (sides % k != 0) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }

}
