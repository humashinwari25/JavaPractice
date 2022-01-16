package StringPractice;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word or sentence: ");
        String word = input.nextLine();

        char first = word.charAt(0);
        int w = word.length();
        char last = word.charAt(word.length()-1);

        if(first==last){
            System.out.println("last characters are the same");
        }else
            System.out.println("last characters are different");
        input.close();
    }
}
/*
1. write a program that can check if the first and
 last characters of the string are same
            ex:
                level
            output:
                same

 */