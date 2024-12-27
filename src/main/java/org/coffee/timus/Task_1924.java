package org.coffee.timus;

import java.util.Scanner;

public class Task_1924 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {


            int n = in.nextInt();
            if (isGrimy(n)) {
                System.out.println("grimy");
            } else {
                System.out.println("black");
            }
        }
    }

    public static boolean isGrimy(int n) {
        if (n < 3) {
            return true;
        } else {
            if (n % 2 == 0) {
                return isGrimy(n - 1);
            } else {
                return !isGrimy(n - 1);
            }
        }
    }

}
