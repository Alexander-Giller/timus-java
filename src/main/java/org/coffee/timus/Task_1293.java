package org.coffee.timus;

import java.util.Scanner;

public class Task_1293 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println(a * b * c * 2);
        }
    }

}
