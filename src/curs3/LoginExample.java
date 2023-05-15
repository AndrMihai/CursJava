package curs3;

import java.util.Scanner;

public class LoginExample {
	
	/* 
	 * Facem un program care citeste de la tastatura un user si o parola si le verifica
	 * daca sunt la fel ca urmatoarele: 
	 * String "TestUser" - username
	 * int 1234			 - parola
	 * Daca sunt la fel printeaza : "login successful"
	 * Daca nu sunt la fel printeaza: "Username or password is incorrect"
	 */
	
	public int password;
	public String username;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username : ");
		username = scan.next();
		System.out.println("please enter the password : ");
		password = scan.nextInt();
		scan.close();
	}
	
	//pentru String intotdeauna folosim equals pentru comparare
	// && -> "and" operator
	// || -> "or" operator
	public void checkCredentials() {
		
		if(username.equals("TestUser") && password == 1234) {
			
			System.out.println("Login Successful");
			
		} else { 
			
			System.out.println("Username or password is incorrect");
			
			
		}
		
	}
	

}
