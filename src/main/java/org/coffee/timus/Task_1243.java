package org.coffee.timus;

import java.math.BigInteger;
import java.util.Scanner;

public class Task_1243 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            BigInteger input = in.nextBigInteger();
            System.out.println(input.remainder(new BigInteger("7")));
        }
    }

}
