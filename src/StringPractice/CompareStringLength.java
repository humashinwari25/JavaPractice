package StringPractice;

import java.util.Scanner;

public class CompareStringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word or sentence: ");
        String word = input.nextLine();

        int wordLength = word.length();

        if (wordLength == 0){
            System.out.println("string is empty");
        }else if(wordLength > 3){
            System.out.println(word.charAt(word.length()-3) + "" +
                    word.charAt(word.length()-2) +
                    word.charAt(word.length()-1));
        }else {
            System.out.println(word);
        }
        input.close();
    }
}
/*
3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */