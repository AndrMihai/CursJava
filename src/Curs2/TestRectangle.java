package Curs2;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle obj1 = new Rectangle(3, 4); //asa faci un obiect al unei clase
		obj1.calculateArea();
		
		System.out.println("Aria este " + obj1.calculateArea());
		int sum = 20 + obj1.calculateArea();
		System.out.println("Valoarea sum este " + sum);

	}

}
