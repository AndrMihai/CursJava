package Homework;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Tema14Ex1 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, null, 4, 5, 6, 7, null, 9};
        String arrayAsString = arrayToString(numbers);
        System.out.println(arrayAsString);
    }

    public static String arrayToString(Integer[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                sb.append(array[i]);
            } else {
                sb.append("null");
            }

            if (i < array.length - 1) {
                sb.append(", ");
            }
        }

        return "[" + sb.toString() + "]";
    }
}