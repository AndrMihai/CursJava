package Homework;

public class Tema14Ex3 {
    public static void main(String[] args) {
        int[][] matrix = {{31, 21, 3}, {41, 50, 6}, {70, 89, 9}};
        int diagonalSum = calculateDiagonalSum(matrix);
        System.out.println("Suma diagonala a matricei este: " + diagonalSum);
    }

    public static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}