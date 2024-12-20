package org.coffee.timus;

import java.util.Scanner;

public class Task_1785 {

    public interface INumberToWordTransformer {
        String transform(int number);
        boolean check(int number);
        INumberToWordTransformer setNext(String title, int left, int right);
    }

    public static class NumberToWordTransformer implements INumberToWordTransformer {
        private int left;
        private int right;
        private String title;
        private INumberToWordTransformer next;

        public NumberToWordTransformer(String title, int left, int right) {
            this.title = title;
            this.right = right;
            this.left = left;
        }

        @Override
        public INumberToWordTransformer setNext(String title, int left, int right) {
            this.next = new NumberToWordTransformer(title, left, right);
            return this.next;
        }

        @Override
        public String transform(int number) {
            if (check(number)) {
                return this.title;
            } else {
                if (this.next == null) {
                    throw new IllegalArgumentException("Unsupported number: " + number);
                }
                return this.next.transform(number);
            }
        }

        @Override
        public boolean check(int number) {
            return number >= this.left && this.right >= number;
        }



    }


    public static void main(String[] args) {
        // Sequence construct
        INumberToWordTransformer wordTransformer = new NumberToWordTransformer("few", 1, 4);
        wordTransformer.setNext("several", 5, 9)
                .setNext("pack", 10, 19)
                .setNext("lots", 20, 49)
                .setNext("horde", 50, 99)
                .setNext("throng", 100, 249)
                .setNext("swarm", 250, 499)
                .setNext("zounds", 500, 999)
                .setNext("legion", 1000, Integer.MAX_VALUE);


        try (Scanner in = new Scanner(System.in)) {
            int input = in.nextInt();
            String result = wordTransformer.transform(input);
            System.out.println(result);
        }
    }

}
