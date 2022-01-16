package StringPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = input.nextLine();

        int messageLength = message.length();
       // String reverse = ""+message.charAt(4)+message.charAt(3)+message.charAt(2)+message.charAt(1)+message.charAt(0);

        if(messageLength < 5) {
            System.out.println("Too short!");
        }else if (messageLength>5){
            System.out.println("Too Long!");
        }else{
            System.out.println(""+message.charAt(4)+message.charAt(3)+message.charAt(2)+message.charAt(1)+message.charAt(0));
        }
        input.close();

    }
}
/*
1.  Create a class called Reverse, write a program that will
reverse a string. Your program should reverse a string only 5
characters long. If word is shorter, display message: "Too short!".
 If word is longer, display message: "Too long!". Otherwise, reverse
 this word and print out result into the console.
 */