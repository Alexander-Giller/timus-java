package org.coffee.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Task_1146 {

    public static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static class Rectangle {
        private final Point tl;
        private final Point br;

        public Rectangle(Point tl, Point br) {
            this.br = br;
            this.tl = tl;
        }

        public Point getBr() {
            return br;
        }

        public Point getTl() {
            return tl;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Rectangle rectangle = (Rectangle) o;
            return Objects.equals(tl, rectangle.tl) && Objects.equals(br, rectangle.br);
        }

        @Override
        public int hashCode() {
            return Objects.hash(tl, br);
        }
    }


    public static Map<Rectangle, Integer> results = new HashMap<>();

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int size = in.nextInt();
            int[][] matrix = new int[size][size];

            for (int i = 0; i < size; ++i)
                for (int j = 0; j < size; ++j)
                    matrix[i][j] = in.nextInt();

            int res = matrix[0][0];
            for (int i = size - 1; i >= 0; --i)
                for (int j = size - 1; j >= 0; --j)
                    for (int i1 = i; i1 < size; ++i1)
                        for (int j1 = j; j1 < size; ++j1) {
                            int tmp_max = calcSum(matrix, i, j, i1, j1);
                            if (tmp_max > res) {
                                res = tmp_max;
                            }
                        }

            System.out.println(res);
        }
    }

    public static int calcSum(int[][] matrix, int i, int j, int n, int k) {
        if (i == n && j == k)
            return matrix[i][j];

        Rectangle rectangle = new Rectangle(new Point(i, j), new Point(n, k));

        int res;
        if (results.get(rectangle) == null) {
            if (n - 1 >= i) {
                res = calcSum(matrix, i, j, n - 1, k) + calcSum(matrix, n, j, n, k);
            } else if (k -1 >= j) {
                res = calcSum(matrix, i, j, n, k - 1) + calcSum(matrix, i, k, n, k);
            } else {
                res = 0;
            }

            results.put(rectangle, res);
        }

        return results.get(rectangle);
    }

}
