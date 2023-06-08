package curs8;

public class AgeVerifier {
	
	public void checkAge(int age) throws InvalidAgeException {
		
		if(age<18) {
			
			throw new InvalidAgeException("Hai ma pe bune? nici macar 18 ani nu ai");
			
		}else {
			System.out.println("You are allowed to proceed!");
		}
		
	}

}
