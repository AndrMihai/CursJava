package curs3;
import java.util.Scanner;

public class ParSauImpar {
	
		int number;
	
		public void askTheUser() {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number : ");
			number = scan.nextInt();
			scan.close();
		}
		
		public void CheckNrIsOddOrEven() {
			
			if(number % 2 == 0) {
				
				System.out.println(number + " : este par!");
				
			}else {
				System.out.println(number + " : este impar!");
				
			}
			
			
		}
	
}
