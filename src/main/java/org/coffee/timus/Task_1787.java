package org.coffee.timus;

import java.util.Scanner;

public class Task_1787 {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int capacity = in.nextInt();
            int n = in.nextInt();
            int currentTraffic = 0;
            while (n > 0) {
                --n;
                currentTraffic += in.nextInt();
                currentTraffic -= capacity;
                if (currentTraffic < 0) {
                    currentTraffic = 0;
                }
            }
            System.out.println(currentTraffic);
        }
    }

}
