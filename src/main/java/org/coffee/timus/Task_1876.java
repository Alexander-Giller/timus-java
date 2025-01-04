package org.coffee.timus;

import java.util.Scanner;

public class Task_1876 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();

            int sum1 = 2 * 39 + 40 + 2 * (a - 40) + 1;
            int sum2 = b * 2 + 40;

            System.out.println(Math.max(sum1, sum2));

        }
    }

}
