package org.coffee.timus;

import java.util.Scanner;

public class Task_1607 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int left = in.nextInt();
            int leftAdd = in.nextInt();
            int right = in.nextInt();
            int rightAdd = in.nextInt();

            int result;

            while (true) {
                if (left >= right) {
                    result = left;
                    break;
                } else {
                    left += leftAdd;
                }

                if (right <= left) {
                    result = right;
                    break;
                } else {
                    right -= rightAdd;
                }
            }

            System.out.println(result);

        }
    }

}
