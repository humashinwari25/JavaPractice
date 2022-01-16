package ForLoop;

import java.util.Scanner;

public class LettersDigitsSpecialCharacters {
    public static void main(String[] args) {

        String str = "ghybk34@";
        String digits = "";
        String letters = "";
        String specialcha = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {
                    specialcha += ch;
                }
            }
        }
        System.out.println("Letters: " + letters);
            System.out.println("digits: " + digits);
            System.out.println("specialcha: " + specialcha);

    }
}
/*
 5. write a program that can retive the digits,
 letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */