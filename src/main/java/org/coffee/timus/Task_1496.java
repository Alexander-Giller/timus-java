package org.coffee.timus;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_1496 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();

            Set<String> submitters = new HashSet<>();
            Set<String> spammers = new HashSet<>();

            while (n > 0) {
                --n;
                String name = in.nextLine();
                if (!submitters.add(name)) {
                    spammers.add(name);
                }
            }

            for (String spammer: spammers) {
                System.out.println(spammer);
            }
        }
    }

}
