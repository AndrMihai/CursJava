package Homework;

public class Tema14Ex2 {
	
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 9, 6}, {7, 8, 5}};
        int highestNumber = gasesteNumarulCelMaiMare(matrix);
        System.out.println("Cel mai mare numar este: " + highestNumber);
    }

    public static int gasesteNumarulCelMaiMare(int[][] matrix) {
        int highestNumber = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > highestNumber) {
                    highestNumber = num;
                }
            }
        }

        return highestNumber;
    }
}