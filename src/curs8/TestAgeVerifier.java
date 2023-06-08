package curs8;
import java.util.*;

public class TestAgeVerifier {

	public static void main(String[] args) {
		AgeVerifier obj = new AgeVerifier();
		System.out.println("Please enter your age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		try {
			obj.checkAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
