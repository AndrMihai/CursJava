package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		// ++ -> increment ( aduna cu 1)
		// -- > decrement (Scade cu 1)
		// num++   num= num+1  num+=1
		/*
		 * num++ -> post increment
		 * ++num -> pre increment
		 * 
		 * 
		 * 
		 */
		
		System.out.println("------POST--------");
		int num = 10;
		System.out.println("Valoarea lui num inainte de increment: " + num);
		System.out.println("Valoarea lui num in POST increment " + num++); //dupa executie de increment
		System.out.println("Valoarea lui dupa increment " + num);
		System.out.println("------PRE--------");

		int num2 = 10;
		System.out.println("Valoarea lui num inainte de increment: " + num2);
		System.out.println("Valoarea lui num in POST increment " + ++num2); 
		System.out.println("Valoarea lui dupa increment " + num2);
	}

}
