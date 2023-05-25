package Homework;

import java.util.Scanner;

public class Tema4Ex5 {
	
	int numar;
	
public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		numar = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numar * i);
			
		}
}

	public static void main(String[] args) {

		Tema4Ex5 obj = new Tema4Ex5();
		obj.askTheUser();
	}

}
