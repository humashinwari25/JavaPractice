package StringPractice;

import java.util.Scanner;

public class MiddleCharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a three letter word: ");
        String word = scan.next();

        int length = word.length();


        if(length==3) {
            if (word.charAt(1) == 'a' || word.charAt(1) == 'A') {
                System.out.println("Cool word");
            } else {
                System.out.println("Okay word");}
            }else if(length < 3){
                System.out.println("word is too short");
            }else{
                System.out.println("word is too long");
            }
scan.close();


        }

    }

/*
4. write a program that asks the user enter a three letter word.
Check if the middle character of the given word is 'a'. In the case
it is print: "Cool word", but in the case the middle letter is not
'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

 */