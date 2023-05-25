package Homework;

import java.util.Scanner;

public class Tema4Ex4 {
	
	int numar;
	int suma;
	
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter a number : ");
		//numar = scan.nextInt();
		//scan.close();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Please enter a number : ");
			numar = scan.nextInt();
			suma = suma + numar;
			
		}
		
		System.out.println(suma);
	}

	

	public static void main(String[] args) {
	
		Tema4Ex4 obj = new Tema4Ex4();
		obj.askTheUser();

	}

}
