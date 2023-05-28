package Homework;
import java.util.*;

public class Tema5Ex2 {

	public static void main(String[] args) {

		    int n = 0;
	        int firstNum = 0;
	        int secondNum = 1;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Introdu numarul maxim de numbere de printat");
	        n = scan.nextInt();
	        System.out.println("Fibonacci cu For:");
	        System.out.print(firstNum + " " + secondNum);
	        for (int i = 2; i < n; i++) {
	            int nextNum = firstNum + secondNum;
	            System.out.print(" " + nextNum);

	            firstNum = secondNum;
	            secondNum = nextNum;
	        }
	        System.out.println();
	        System.out.println("Fibonacci cu While:");
	        firstNum = 0;
	        secondNum = 1;
	        System.out.print(firstNum + " " + secondNum);
	        int count = 2;
	        while (count < n) {
	            int nextNum = firstNum + secondNum;
	            System.out.print(" " + nextNum);

	            firstNum = secondNum;
	            secondNum = nextNum;
	            count++;
	        }
	}

}
