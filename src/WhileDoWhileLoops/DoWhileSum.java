package WhileDoWhileLoops;

import java.util.Scanner;

public class DoWhileSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int sum = 0;
        int num1 = input.nextInt();

        if(num1<0){
            System.out.println("sum = " + sum);
        }else {

            sum += num1;

            while (num1 > 0) {

                System.out.println("Enter a number:");
                int num2 = input.nextInt();
                if (num2 < 0) {
                    break;
                }
                sum += num2;
            }

            System.out.println("sum = " + sum);
        }

    }
}
/*
2. Write a program that calculates the sum of
        numbers entered by the user until user enters a
        negative number.

        hint: you need an infinite loop
        */