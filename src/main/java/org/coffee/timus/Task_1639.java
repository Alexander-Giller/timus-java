package org.coffee.timus;

import java.util.Scanner;

public class Task_1639 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();

            int steps = b - 1 + b * (a - 1);
            if (steps % 2 == 1) {
                System.out.println("[:=[first]");
            } else {
                System.out.println("[second]=:]");
            }
        }
    }

}
