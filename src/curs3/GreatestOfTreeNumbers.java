package curs3;
import java.util.Scanner;


/* Facem un program care intreaba user-ul 3 numbere
 * verificam care dintre cele 3 numere este cel mai mare si printam corespunzator
 * Daca doua numere sunt egale si sunt cele mai mari printam
 * some numbers are equal
 * Ex: First number is the greatest!
 */

public class GreatestOfTreeNumbers {
	
	//int number1, number2, number3;
	int nr1;
	int nr2;
	int nr3;
	
	public void askTheNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		nr1= scan.nextInt();
		System.out.println("Please enter the 2nd number: ");
		nr2= scan.nextInt();
		System.out.println("Please enter the 3rd number: ");
		nr3= scan.nextInt();
		scan.close();
		
	}
	
	public void compareTheNumbers() {
		
		if (nr1 > nr2 && nr1 > nr3) {
			System.out.println("First number is the greatest!");	
		}else if(nr2 > nr1 && nr2 > nr3) {
			System.out.println("Second number is the greatest!");
		}else if(nr3 > nr1 && nr3 > nr2) {
			System.out.println("Thrid number is the greatest!");
		}else {
			System.out.println("Some numbers are equal!");
		}
	}

}
