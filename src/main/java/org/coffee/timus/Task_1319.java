package org.coffee.timus;

import java.util.*;

public class Task_1319 {

    public static void diagonalWolkerWithFill(int[][] matrix, int size) {
        int currentLine = 0;
        int currentColumn = 0;
        int i = 0;
        int j = 0;
        for (int k = 1; k <= size * size; ++k) {
//            System.out.print(matrix[i][j] + " ");
            matrix[i][j] = k;

            if (i == 0 || j == size - 1) {
                if (currentLine < size - 1) {
                    currentLine++;
                } else if (currentColumn < size - 1) {
                    currentColumn++;
                }
                i = currentLine;
                j = currentColumn;

            } else {
                i--;
                j++;
            }
        }
    }

    public static void diagonalMirror(int[][] matrix, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j) {
                    continue;
                }
                int a = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = a;
            }
        }
    }

    public static int[][] rotateRight(int[][] matrix, int n) {
        int[][] resultMatrix = new int[n][n];

        for (int i = 0, a = n - 1; i < n; ++i, --a) {
            for (int j = 0, b = 0; j < n; ++j, ++b) {
                int value = matrix[i][j];
                resultMatrix[b][a] = value;
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[][] matrix = new int[n][n];
            diagonalWolkerWithFill(matrix, n);
            diagonalMirror(matrix, n);
            matrix = rotateRight(matrix, n);

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

}
