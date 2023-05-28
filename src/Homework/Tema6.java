package Homework;

import java.util.Scanner;

public class Tema6 {
	
	

	public static void main(String[] args) {
		int an;
		int valoareVanzari;
		int luna;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Te rog introdu un an: ");
		an = scan.nextInt();
		System.out.println("Te rog sa introduci valoarea vanzarilor: ");
		valoareVanzari = scan.nextInt();
		System.out.println("Te rog sa introduci o luna: ");
		luna = scan.nextInt();
		
		switch(an) {
		
		case 1:
			System.out.println("Ai primit un bonus de 100");
		 break;
		
		case 2: 
			System.out.println("Ai primit un bonus de 200");
		break;
		
		case 3: if(valoareVanzari > 10000) {		
				System.out.println("Ai primit un bonus de 1200");
				break;
		}
			if (valoareVanzari <= 5000) {
				System.out.println("Ai primit un bonus de 600");
			break;
		} 	if (luna >= 1 && luna <= 6) {
			System.out.println("Ai primit bonus de 800");
			break;
		}	if (luna >= 7 && luna <= 11) {
			System.out.println("Ai primit bonus de 1000");
			break;
		}	if (luna == 12) {
			System.out.println("In decembrie se vand singure");
			break;
		}
		
		
		default: System.out.println("Nu ai primit bonus"); break;
		
		}
		
	}

}
