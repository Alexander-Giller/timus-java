package org.coffee.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1638 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int width = in.nextInt();
            int wrap = in.nextInt();
            int first = in.nextInt();
            int second = in.nextInt();

            int res = 0;

            if (first < second) {
                res += wrap * 2;
                res += (second - first - 1) * (width + wrap * 2);

            } else {
                res += width;
                res += (first - second) * (width + wrap * 2);
            }

            System.out.println(res);
        }
    }

}
