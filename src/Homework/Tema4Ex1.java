package Homework;

import java.util.Scanner;

public class Tema4Ex1 {
	
	
	
	double factura;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		factura = scan.nextInt();
		scan.close();
	}
	
	public void discountF10() {
		
		/*if (factura >= 100) {
			System.out.println("Discount-ul tau este: " + factura * 10 / 100 + " lei");
		} else {
			
			System.out.println("Discount-ul tau este:  " + factura * 5 / 100 + " lei");
		}
		//rezultat = conditie?expresie true : expresie fals -> else
		//conditie = factura>=100 
		//expresie true - System.out.println("Discount-ul tau este: " + factura * 10 / 100 + " lei");
		//expresie fals - System.out.println("Discount-ul tau este:  " + factura * 5 / 100 + " lei");
		*/
		
		String rezultat = (factura >= 100) ? "Discount-ul tau este: " + factura * 10 / 100 + " lei" : "Discount-ul tau este:  " + factura * 5 / 100 + " lei";
		System.out.println(rezultat);
		
	}
	

	public static void main(String[] args) {
		
		Tema4Ex1 obj = new Tema4Ex1();
		obj.askTheUser();
		obj.discountF10();

	}

}
