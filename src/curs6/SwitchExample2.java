package curs6;
import java.util.*;

public class SwitchExample2 {

	public static void main(String[] args) {
		/*
		 * facem un program care verifica daca un student este eligibil pt bursa
		 * conditiile sunt:
		 * Sa fie anul 3
		 * Sa aiba un punctaj de 80 pt bursa 1
		 * Sa aiba un punctaj de 50 pt bursa 2
		 * 
		 */
		
		int an;
		int punctaj;
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce an esti: ");
		an = scan.nextInt();
		
		switch (an) {
		case 3: System.out.println("Te rog introdu punctajul: ");
		punctaj = scan.nextInt();
		switch (punctaj) {
		case 80: System.out.println("Esti eligibil pt bursa 1"); break;
		case 50: System.out.println("Esti eligibil pt bursa 2"); break;
		default: System.out.println("Nu esti eligibil");
		}
		break;
		default : System.out.println("Nu esti eligibil");
		}

	}

}
