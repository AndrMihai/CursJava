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
	static boolean valid;
	Scanner scan = new Scanner(System.in);
	
	public void getUsername() {
		System.out.println("Te rog introdu usernameul: ");
		username = scan.next();
	}
	
	public String getPassword() {
		System.out.println("Te rog introdu parola:");
		return scan.next();
	}
	
	public void printPasswordRules() {
		System.out.println("Reguli parola:");
		System.out.println("Parola trebuie sa fie minim 10 caractere\r\n"
				+ "Parola trebuie sa contina un upper case\r\n"
				+ "Parola nu trebuie sa fie ca username-ul");
	}
	
	public void checkPasswordRules(String password) {
		valid = true;		
		if(password.length() < 10) {
			System.out.println("Parola trebuie sa fie minim 10 caractere");
			valid = false;
		}
		if(password.equals(password.toLowerCase())) {
			System.out.println("Parola trebuie sa contina un upper case");
			valid = false;
		}
		if(password.equals(username)) {
			System.out.println("Parola nu trebuie sa fie la fel ca username");
			valid = false;
		}	
	}

	public static void main(String[] args) {
		
		PasswordValidator obj = new PasswordValidator();
		obj.printPasswordRules();
		obj.getUsername();
		
		do {
			obj.checkPasswordRules(obj.getPassword());
			
		}while(!valid);
	
		System.out.println("Parola este valida!");
	}

}
