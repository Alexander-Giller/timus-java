package org.coffee.timus;

import java.util.Scanner;

public class Task_1409 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int left = in.nextInt();
            int right = in.nextInt();
            System.out.println((right - 1) + " " + (left - 1));
        }
    }

}
