package Homework;

import java.util.Scanner;

public class Tema4Ex3 {
	
	int punctaj;
	String calificativ;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		punctaj = scan.nextInt();
		scan.close();
	}
	
	public void nuConteaza() {
		
		if (punctaj >= 90) {
		calificativ = "FB";
		} else if(punctaj >= 80) {
		calificativ = "B";
		} else {
			calificativ = "S";
		}
		
		String result;
		calificativ = punctaj >= 90? "FB": punctaj >= 80 ? "B" :  "S";
		
		if (calificativ.equals("FB")) {
			
			System.out.println("Ai primit Foarte Bine");
			
		} else if (calificativ.equals("B")) {
			System.out.println("Ai primit Bine");
		} else {
			System.out.println("Ai primit Suficient");
		}
		
		result = calificativ.equals("FB")?"Ai primit Foarte Bine": calificativ.equals("B")?"Ai primit bine" : "Ai primit Suficient";
		System.out.println(result);
	
	}

	public static void main(String[] args) {
		
		Tema4Ex3 obj = new Tema4Ex3();
		obj.askTheUser();
		obj.nuConteaza();

	}

}

