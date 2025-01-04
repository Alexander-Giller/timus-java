package org.coffee.timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_1563 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();

            Set<String> titles = new HashSet<>();
            int count = 0;
            while (n > 0) {
                --n;
                String inputTitle = in.nextLine();
                if (!titles.add(inputTitle)) {
                    ++count;
                }
            }

            System.out.println(count);
        }
    }

}
