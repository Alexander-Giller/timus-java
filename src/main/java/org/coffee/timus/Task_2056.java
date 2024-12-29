package org.coffee.timus;

import java.util.Scanner;

public class Task_2056 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            double sum = 0;
            boolean hasThree = false;
            for (int i = 0; i < n; ++i) {
                int score = in.nextInt();
                if (score == 3) {
                    hasThree = true;
                }
                sum += score;
            }

            if (sum >= n * 5.0) {
                System.out.println("Named");
            } else if (hasThree) {
                System.out.println("None");
            } else if (sum >= 4.5 * n) {
                System.out.println("High");
            } else{
                System.out.println("Common");
            }
        }

    }

}
