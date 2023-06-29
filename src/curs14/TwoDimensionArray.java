package curs14;

import java.util.Arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		//int[] array = {1,2,3,4};
		//array[2] //--> 3; index based
		
		int[][] array = {{1,2}, {3,4,5}};
		
		/*
		 * 				col 0 		col 1
		 * 	row 0 		1			2
		 * 	row 1 		3			4
		 * 
		 */
		
		System.out.println(array.length);
		
		//Object[][] -----> string row, int column sau boolean etc.
		//T[][]
		//Object[][] array = {{"String", true} , {22.0, "altString"}};
		
		for(int i =0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.println(array[i][j]+ "  ");
			}
		}
		System.out.println(array.length);
		//int[][] array = {{1,2}, {3,4,5}};
		for(int[] row: array) {
			System.out.println("Row" + Arrays.toString(row));
			for(int col : row) {
				System.out.println("Col :" + col);
				
			}
		}
		System.out.println("------------------------");
		String[][] textArray = new String[4][3];
		
		System.out.println(textArray.length);
		System.out.println(textArray[0].length);

	}

}
