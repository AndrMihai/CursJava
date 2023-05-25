package Homework;

import java.util.Scanner;

public class Tema3Ex3 {
	
	
int day;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		day = scan.nextInt();
		scan.close();
	}
	
	public void ziuaSaptamanii() {
		
		if (day == 1) {
			System.out.println("Azi e luni");
		} else if (day == 2) {
			System.out.println("azi e marti");
		} else if (day == 3) {
			System.out.println("azi e miercuri");
		} else if (day == 4) {
			System.out.println("azi e joi");
		} else if (day == 5) {
			System.out.println("azi e vineri");
		} else if (day == 6) {
			System.out.println("azi e sambata");
		} else if (day == 7) {
			System.out.println("azi e duminica");
		} else {
			System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
		} //aici cred ca puteam sa folosesc un switch, any tips are welcome :D
		
	}

	public static void main(String[] args) {
		
		Tema3Ex3 obj = new Tema3Ex3();
		obj.askTheUser();
		obj.ziuaSaptamanii();

	}

}
