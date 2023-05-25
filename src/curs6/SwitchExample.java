package curs6;
import java.util.*;

public class SwitchExample {

	public static void main(String[] args) {
		
		/*
		 * Intreb userul un calificativ
		 * in functie de calificativ ii acord o nota
		 */
		
		System.out.println("Te rog introdu un calificativ");
		Scanner scan = new Scanner(System.in);
		String calificativ = scan.next();

		switch(calificativ.toUpperCase()) {
		
		case "A" :
			System.out.println("Felicitari");
			break;
		case "B" :	
			System.out.println("Destul de bine");
			break;
		case "C" :	
			System.out.println("Suficient");
			break;
		case "D" :	
			System.out.println("Insuficient");
			break;
		default : 
			System.out.println("Nota invalida!");
		}
	}

}
