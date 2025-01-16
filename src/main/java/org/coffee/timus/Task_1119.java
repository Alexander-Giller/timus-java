package org.coffee.timus;


import java.util.*;

public class Task_1119 {

    public static class Point {
        private short x;
        private short y;

        public Point(short x, short y) {
            this.x = x;
            this.y = y;
        }

        public short getX() {
            return x;
        }

        public short getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String
        toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    final public static Map<Point, Short> RESULTS = new HashMap<>();
    final public static double DIAGONAL_WAY = Math.sqrt(2) * 100;
    final public static double SIMPLE_WAY = 100;
    final public static short DEFAULT_VALUE = -1;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            short xLimit = in.nextShort();
            short yLimit = in.nextShort();
            int k = in.nextShort();

            Point startPoint = new Point((short) 0, (short) 0);
            RESULTS.put(startPoint, DEFAULT_VALUE);
            while (k > 0) {
                --k;
                short x = in.nextShort();
                short y = in.nextShort();
                RESULTS.put(new Point(x, y), DEFAULT_VALUE);
            }

            int diagonals = getMaxDiagonalNumbers(startPoint);
            double res = DIAGONAL_WAY * diagonals +
                    (SIMPLE_WAY * (xLimit - diagonals)) +
                    (SIMPLE_WAY * (yLimit - diagonals));

//            System.out.println(diagonals);
            System.out.println(Math.round(res));
        }
    }

    public static short getMaxDiagonalNumbers(Point point) {
        int x = point.getX();
        int y = point.getY();

        if (RESULTS.get(point) == DEFAULT_VALUE) {
            int res = 0;
            for (Point nextPoint: RESULTS.keySet()) {
                short xNextPoint = nextPoint.getX();
                short yNextPoint = nextPoint.getY();

                if (xNextPoint > x && yNextPoint > y) {
                    res = Math.max(res, 1 + getMaxDiagonalNumbers(nextPoint));
                }
            }
            RESULTS.put(point, (short) res);
        }

        return RESULTS.get(point);
    }
}
