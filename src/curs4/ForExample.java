package curs4;

public class ForExample {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			
			if( i == 5) {
				//break; intrerupe
				continue; //face skip la conditie si te intoarce inapoi in bucla
			}
			
			System.out.println(i);
		}

	}

}
