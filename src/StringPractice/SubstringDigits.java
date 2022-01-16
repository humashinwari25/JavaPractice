package StringPractice;

import java.util.Scanner;

public class SubstringDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        input.close();
        char firstChar = word.charAt(0);
        String result = "";

        if (firstChar >= '0' && firstChar <= '9') { //if the character is between '0' to '9' on the asci table then it's digit
            result = "first character is digit";
        } else if (firstChar >= 'A' && firstChar <= 'Z') { // if the character is between 'A' to 'Z' then it's letter
            result = "first character is uppercase letter";
        } else if (firstChar >= 'a' && firstChar <= 'z') {// if the character is between 'a' to 'z' then it's letter
            result = "first character is lowercase letter";
        } else { // if the character is neither digit nor letter, then it's special character
            result = "first character is special character";
             //
            }
        System.out.println(result);
        }
    }
/*
 5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */