package Homework;
import java.util.Arrays;
import java.util.Scanner;

public class Tema7Ex1 {
    public static void main(String[] args) {
        int length = lungimeArray();
        int[] arr = genereazaArray(length);

        // Print the original array
        System.out.println("Array-ul original: " + Arrays.toString(arr));

        // Reverse the array using for loop
        int[] reversedArrForLoop = arrayCuFor(arr.clone());
        System.out.println("Arrayul inversat cu For: " + Arrays.toString(reversedArrForLoop));

        // Reverse the array using while loop
        int[] reversedArrWhileLoop = arrayCuWhile(arr.clone());
        System.out.println("Array-ul inversat cu While: " + Arrays.toString(reversedArrWhileLoop));
    }

    public static int lungimeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cate elemente trebuie sa aiba array-ul: ");
        return scanner.nextInt();
    }

    public static int[] genereazaArray(int length) {
        int[] arr = new int[length];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu elementele array-ului:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static int[] arrayCuFor(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        for (; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        return arr;
    }

    public static int[] arrayCuWhile(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}