package curs1;

public class FirstClass {
	//one line comment
	// public -> access modifier || String -> Data Type || nume -> numele variabilei 
	public String name = "Oana"; //variabile de instanta - Are nevoie de o instanta a clasei pt a putea fi folosita
	public int age; 

	public static void main(String[] args) {
		
String prenume = "Ion"; //variabila locala

FirstClass obj = new FirstClass();

System.out.println(obj.name);

System.out.println(obj.age);

obj.age = 20;

System.out.println(obj.age);

System.out.println(prenume);

System.out.println("Test");
	}

}
