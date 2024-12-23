package org.coffee.timus;

import java.util.Scanner;

public class Task_2100 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();
            int count = n + 2;
            while (n > 0) {
                n--;
                String input = in.nextLine();
                if (input.contains("+one")) {
                    count++;
                }
            }
            if (count == 13) {
                count++;
            }
            System.out.println(count * 100);
        }
    }

}
