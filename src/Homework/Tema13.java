package Homework;

public class Tema13 {
    public static void main(String[] args) {
        String paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

        int count = countOccurrences(paragraph, "Nulla");
        System.out.println("Cuvantul 'Nulla' apare de " + count + " ori");

        String[] sentences = splitIntoSentences(paragraph);
        System.out.println("\nNumarul de propozitii: " + sentences.length);
        System.out.println("Propozitii individuale:");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

        StringBuilder sb = new StringBuilder(paragraph);
        deleteChar(sb, 'a');
        System.out.println("\nString-ul dupa ce am sters toate instantele ale literei 'a':");
        System.out.println(sb.toString());

        sb = new StringBuilder(paragraph);
        replaceChar(sb, 'o', '#');
        System.out.println("\nString-ul dupa ce-am inlocuit toate instantele de 'o' cu '#':");
        System.out.println(sb.toString());
    }

    public static int countOccurrences(String text, String word) {
        int count = 0;
        int index = 0;

        while (index != -1) {
            index = text.indexOf(word, index);
            if (index != -1) {
                count++;
                index += word.length();
            }
        }

        return count;
    }

    public static String[] splitIntoSentences(String text) {
        String[] sentences = text.split("\\. ");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim().replaceAll("[^a-zA-Z0-9\\s]", "");
        }
        return sentences;
    }

    public static void deleteChar(StringBuilder sb, char ch) {
        int index = sb.indexOf(String.valueOf(ch));
        while (index != -1) {
            sb.deleteCharAt(index);
            index = sb.indexOf(String.valueOf(ch));
        }
    }

    public static void replaceChar(StringBuilder sb, char ch, char replacement) {
        int index = sb.indexOf(String.valueOf(ch));
        while (index != -1) {
            sb.setCharAt(index, replacement);
            index = sb.indexOf(String.valueOf(ch), index + 1);
        }
    }
}