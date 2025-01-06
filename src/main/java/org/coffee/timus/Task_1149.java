package org.coffee.timus;

import java.util.Scanner;

public class Task_1149 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            System.out.println(getSn(n, 1));

        }
    }

    public static String getSn(int n, int i) {
        if (n == 1) {
            return getAn(1, 1) + "+" + i;
        } else {
            return "(" + getSn(n - 1, i + 1) + ")" + getAn(n, 1) + "+" + i;
        }
    }

    public static String getAn(int n, int i) {
        if (i == n) {
            return "sin(" + i + ")";
        } else {
            String plusOrMinus = i % 2 == 0 ? "+" : "-";
            return "sin(" + i +
                    plusOrMinus +
                    getAn(n, i + 1) + ")";
        }

    }

}
