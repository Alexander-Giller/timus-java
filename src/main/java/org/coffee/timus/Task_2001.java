package org.coffee.timus;

import java.util.Scanner;

public class Task_2001 {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int a0 = in.nextInt();
            int b0 = in.nextInt();
            int a1 = in.nextInt(); // Don't need.
            int b1 = in.nextInt();
            int a2 = in.nextInt();
            int b2 = in.nextInt(); // Don't need.
            int right = b0 - b1;
            int left = a0 - a2;
            System.out.println(left + " " + right);
        }
    }

}
