package curs8;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		try {
			String nume = null;
			System.out.println(nume.length());
			
		}catch(Exception e) {
			System.out.println("Exception occured");
	
			
		}finally {
			System.out.println("Finally block of code"); //finally folosim doar cand vrem ceva neaparat sa fie executat
		}
		System.out.println("Seteaza parametru inapoi!");

	}

}
