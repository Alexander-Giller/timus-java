package org.coffee.timus;

import java.util.*;

public class Task_1263 {

    public static void main(String[] args) {

        Map<Integer, Integer> candidateVotes = new TreeMap<>(Comparator.comparingInt(value -> value));

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

            for (Map.Entry<Integer, Integer> entry: candidateVotes.entrySet()) {
                double output = (double) entry.getValue() / (double) votes;
                String strOutput = String.format("%.2f", output * 100)
                        .replaceAll(",", ".");
                System.out.println(strOutput + "%");
            }
        }


    }

}
