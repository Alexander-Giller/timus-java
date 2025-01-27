package org.coffee.timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_1290 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int size = in.nextInt();
            List<Integer> input = new ArrayList<>(size);

            int n = size;
            while (n > 0) {
                --n;
                input.add(in.nextInt());
            }

            Collections.sort(input);
            for (int i = size - 1; i >= 0; --i) {
                System.out.println(input.get(i));
            }
        }
    }

}
