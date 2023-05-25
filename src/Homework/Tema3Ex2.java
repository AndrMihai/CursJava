package Homework;

import java.util.Scanner;

public class Tema3Ex2 {
	
int punctaj;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		punctaj = scan.nextInt();
		scan.close();
	}
	public void gradingSystem() {
		
		if (punctaj >= 0 && punctaj < 66) {
			
			System.out.println("Ai picat, mai incearca");
	} else {
		System.out.println("Felicitari! ai trecut");
	}
	}

	public static void main(String[] args) {
		
		Tema3Ex2 obj = new Tema3Ex2();
		obj.askTheUser();
		obj.gradingSystem();

	}

}
