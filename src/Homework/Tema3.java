package Homework;

import java.util.Scanner;

public class Tema3 {
	
	int varsta;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		varsta = scan.nextInt();
		scan.close();
	}
	
	public void checkNumber() {
		
		if (varsta >=18 && varsta <= 65) {
			
			System.out.println("Esti Adult");
		} else if (varsta < 18) {
			System.out.println("Esti Minor");
		} else {
			System.out.println("Esti Batran");
		} //aici nu inteleg cum as putea face cu un singur if else cum cere in assigment :( 
					
	}
	

	public static void main(String[] args) {
		
		Tema3 obj = new Tema3();
	
		obj.askTheUser();
		obj.checkNumber();

	}

}
