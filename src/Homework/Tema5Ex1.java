package Homework;
import java.util.*;

public class Tema5Ex1 {
	
	public final String DEFAULT_USERNAME = "TestUser";
	public final int DEFAULT_PASSWORD = 1234;
	public String username;
	public int password;
	public final int ATTEMPTS = 3;
	public int counter = 0;
	
	Scanner scan = new Scanner(System.in);
	
	public void getUsername() {
		System.out.println("Te rog introdu usernameul: ");
		 username = scan.next();	
	}
	
	public void getPassword() {
		System.out.println("Te rog introdu parola: ");
		 password = scan.nextInt();	
	}

	public static void main(String[] args) {
		
		Tema5Ex1 obj = new Tema5Ex1();
		
		do {
			obj.getUsername();
			obj.getPassword();
			if (obj.username.equals(obj.DEFAULT_USERNAME) && obj.password == obj.DEFAULT_PASSWORD) {
				break;
			} 
			System.out.println("Login Error");
			
		} while(++obj.counter < obj.ATTEMPTS);
			
		  if (obj.counter == obj.ATTEMPTS) {
			  System.out.println("Maximum attempts reached. User blocked");
		  } else {
			  System.out.println("Login Successful");
		  }
	}

}
