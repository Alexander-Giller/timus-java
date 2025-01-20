package org.coffee.timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_1935 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            List<Integer> inputValues = new ArrayList<>(n);
            while (n > 0) {
                --n;
                inputValues.add(in.nextInt());
            }

            Collections.sort(inputValues);

            int sum = inputValues.stream().mapToInt(i -> i).sum();
            sum += inputValues.get(inputValues.size() - 1);

            System.out.println(sum);

        }
    }

}
