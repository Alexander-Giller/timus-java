package org.coffee.timus;

import java.util.Scanner;

public class Task_1925 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int actualNumber = in.nextInt();

            int inputSum = actualNumber;
            int outputSum = 0;

            while (n > 0) {
                --n;
                inputSum += in.nextInt() - 2;
                outputSum += in.nextInt();
            }

            int res = inputSum - (outputSum + 2);
            if (res < 0) {
                System.out.println("Big Bang!");
            } else {
                System.out.println(res);
            }
        }
    }

}
