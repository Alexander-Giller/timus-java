package org.coffee.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1263 {

    public static void main(String[] args) {

        Map<Integer, Integer> candidateVotes = new HashMap<>();
        try (Scanner in = new Scanner(System.in)) {
            int candidateNumber = in.nextInt();
            for (int i = 1; i <= candidateNumber; ++i) {
                candidateVotes.put(i, 0);
            }

            int votes = in.nextInt();
            for (int i = 0; i < votes; ++i) {
                int vote = in.nextInt();
                candidateVotes.put(vote, candidateVotes.get(vote) + 1);
            }



        }

    }

}
