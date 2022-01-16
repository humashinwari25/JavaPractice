package WhileDoWhileLoops;

import java.util.Scanner;

public class MultiplyingWithoutMathematicalOperators {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter two positive numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = 0;

        for (int i = 0; i < num2; i++) {
            result += num1;
        }

        System.out.println("Multiplication = " + result);

    }

}
/*1. Write a program that can divide two positive
        numbers without using / (division) and * (multiplication)
        operators.


        */