package Homework;

import java.util.Scanner;

public class Tema7Ex3 {
    public static void main(String[] args) {
        int[] numere = new int[10];
        numere = getNumere(numere);
        
        System.out.println("Numbere pare cu For:");
        cuFor(numere);
        
        System.out.println("\nNumbere impare cu While:");
        cuWhile(numere);
    }
    
    public static int[] getNumere(int[] numere) {
        Scanner scanner = new Scanner(System.in);
 
        
        System.out.println("Introdu 10 numbers:");
        for (int i = 0; i < numere.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numere[i] = scanner.nextInt();
        } 
        
        return numere;
    }
    
    public static void cuFor(int[] numere) {
        for (int number : numere) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
    
    public static void cuWhile(int[] numere) {
        int i = 0;
        
        while (i < numere.length) {
            if (numere[i] % 2 == 0) {
                System.out.println(numere[i]);
            }
            
            i++;
        }
    }
}