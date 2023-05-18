package curs4;

import java.util.Scanner;

/*
 * facem un program care citeste un text de la tast
 * in text cautam litera a, A
 * daca o gasim, printam ca am gasit litera si de cate ori
 * daca nu o gasim, printam ca litera a nu exista in text
 * 
 * 
 */

public class LetterSearch {

	public static void main(String[] args) {
		
		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		System.out.println(text.length());
		//masina
		//012345
		//text.charAt(i)
		int y=0;
		
		for (int i = 0; i< text.length(); i++) {
			if(text.charAt(i) == 'a' || text.charAt(i) == 'A'){
				y++;
			}
			
		}
		String result = y == 0 ? "Nu exista in text" : "Am gasit litera a de " + y + " ori";
		System.out.println(result);

	}

}
