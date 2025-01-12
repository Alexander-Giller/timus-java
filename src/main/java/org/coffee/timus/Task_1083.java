package org.coffee.timus;

import java.math.BigInteger;
import java.util.Scanner;

public class Task_1083 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            BigInteger base = in.nextBigInteger();
            BigInteger multiplicator = BigInteger.valueOf(in.next().length());

            BigInteger result = base;
            while (true) {
                base = base.add(multiplicator.negate());
                if (BigInteger.ONE.equals(base.max(BigInteger.ONE))) {
                    break;
                }

                result = result.multiply(base);
            }

            System.out.println(result);
        }
    }

}
