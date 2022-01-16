package StringPractice;

import java.util.Scanner;

public class string_longest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word 1: ");
        String word1 = input.nextLine();
        System.out.println("Enter word 2: ");
        String word2 = input.nextLine();

        int s1 = word1.length();
        int s2 = word2.length();

        if (s1 >= s2){
            System.out.println(word1);
        }else
        System.out.println(word2);

        input.close();
    }
}
/*
2. write a program that asks user to enter
two strings, and print out the longest string
 */