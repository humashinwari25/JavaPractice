package WhileDoWhileLoops;


import java.util.Scanner;

public class sumOfNumbers2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Enter first number:");
                int num = input.nextInt();
                System.out.println("Enter second number:");
                int num2 = input.nextInt();


                if (!(num2 > 0 || num > 0)) {

                    System.err.println("Invalid Entry");
                    break;
                }
                System.out.println("Sum = " + (num + num2));
            }
        }
    }
/*
2. Write a program that calculates the sum of
        numbers entered by the user until user enters a negative number.

        hint: you need an infinite loop
        */