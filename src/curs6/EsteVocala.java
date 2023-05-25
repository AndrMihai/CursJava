package curs6;
import java.util.*;

public class EsteVocala {
	
	/* 
	 * Verific daca o litera este consoana sau vocala
	 * folosesc un switch
	 * 
	 */

	public static void main(String[] args) {
		
		System.out.println("Te rog introdu o litera: ");
		Scanner scan = new Scanner(System.in);
		char litera = scan.next().charAt(0);
		//aeiouAEIOU
		
		switch(litera) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': System.out.println("Este Vocala");
		break;
		default:
			System.out.println("Este consoana!");
		}
	}

}
