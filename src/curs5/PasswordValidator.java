package curs5;
import java.util.*;

public class PasswordValidator {
	
	/*
	 * Facem un program care valideaza o parola pe baza unor reguli : 
	 * 1. Parola trebuie sa fie minim 10 caractere
	 * 2. Parola trebuie sa contina un upper case
	 * 3. Parola nu trebuie sa fie ca username-ul
	 * Intrebam userul un username si o parola
	 * il informam regulile parolei
	 * 
	 * Daca parola este valida, atunci printam : "Great Success"
	 * Daca parola este invalida, il informam care reguli nu au fost respectate si
	 * il tinem in bucla pana introduce o parola valida
	 * 
	 */
	String username;
	String password;
	Scanner scan = new Scanner(System.in);
	
	public void getUsername() {
		System.out.println("Te rog introdu usernameul: ");
		username = scan.next();
	}
	
	public void getPassword() {
		System.out.println("Te rog introdu parola: ");
		password = scan.next();
	}
	
	public void printPasswordRules() {
		System.out.println("Reguli parola:");
		System.out.println("Parola trebuie sa fie minim 10 caractere\r\n"
				+ "Parola trebuie sa contina un upper case\r\n"
				+ "Parola nu trebuie sa fie ca username-ul");
	}
	
	public boolean checkPasswordRules() {
		if (password.length() <10 ) {
			
			System.out.println("Parola trebuie sa fie minim 10 caractere");
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
	
	}

}
