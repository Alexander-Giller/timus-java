package org.coffee.timus;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1502 {

    public static Map<BigInteger, BigInteger> RESULTS = new HashMap<>();
    public static BigInteger TWO = new BigInteger("2");

    static {
        RESULTS.put(BigInteger.ZERO, BigInteger.ZERO);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            BigInteger n = in.nextBigInteger();
            BigInteger res = getResult(n);
            System.out.println(res);
        }
    }

    public static BigInteger getResult(BigInteger n) {
        if (RESULTS.get(n) == null) {
            BigInteger res = getResult(n.subtract(BigInteger.ONE))
                    .add(getSumAllNumbersBetween(n.multiply(TWO), n));
            RESULTS.put(n, res);
        }
        return RESULTS.get(n);
    }

    public static BigInteger getSumAllNumbersBetween(BigInteger left, BigInteger right) {
        BigInteger multiplier = left.add(BigInteger.ONE).subtract(right).divide(TWO);
        BigInteger res = left.add(right).multiply(multiplier);
        if (BigInteger.ZERO.equals(right.remainder(TWO))) {
            res = res.add(right.add(right.divide(TWO)));
        }

        return res;
    }

}
