package StringPractice;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String word1 = input.nextLine();

        System.out.println("Enter word 2: ");
        String word2 = input.nextLine();

        System.out.println("Enter word 3: ");
        String word3 = input.nextLine();

        int wordLength1 = word1.length();
        int wordLength2 = word2.length();
        int wordLength3 = word3.length();

        if(wordLength1 == wordLength2 &&
                wordLength1 == wordLength3){
            System.out.println("All words are the same length");
        }else if (wordLength1 != wordLength2 && wordLength1 != wordLength3){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different");
        }
        input.close();
    }
}
/*
5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */