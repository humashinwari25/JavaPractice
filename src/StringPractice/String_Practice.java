package StringPractice;

import java.util.Scanner;

public class String_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Sentence: ");
        String sentence = scan.nextLine();

        char firstChar = sentence.charAt(0);
        System.out.println("firstChar = " + firstChar);
        char lastChar = sentence.charAt(sentence.length()-1);
        System.out.println("lastChar = " + lastChar);

        scan.close();

    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */