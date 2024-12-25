package org.utils;

public class Matrix {

    public static void diagonalWolker(int[][] matrix, int size) {
        int currentLine = 0;
        int currentColumn = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < size * size; ++k) {
//            System.out.print(" " + i + ',' + j + "|");
            System.out.print(matrix[i][j] + " ");

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

}
