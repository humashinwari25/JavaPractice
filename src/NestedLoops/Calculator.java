package NestedLoops;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter First Number");
            int num = input.nextInt();

            System.out.println("Enter second Number");
            int num2 = input.nextInt();

            System.out.println("Enter Math Operator");
            char operator = input.next().charAt(0);


            while (!(operator == '+' || operator == '-' ||
                    operator == '*' || operator == '/')) {
                System.out.println("Enter Valid Operator");
                operator = input.next().charAt(0);
            }

            double result = 0;
            if (operator == '+') {
                result = (num + num2);
            } else if (operator == '-') {
                result = (num - num2);
            } else if (operator == '*') {
                result = (num * num);
            } else {
                result = (num / num2);
            }

            System.out.println(result);

            System.out.println("Do you want to continue?");
            String str = input.nextLine().toLowerCase();

            while (!(str.equals("yes") || str.equals("no"))) { // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter");
                str = input.nextLine().toLowerCase();
            } // it stops if the answer is either ye or no
            if (str.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }
        input.close();
    }
}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this
				step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to
				re-enter until user provides a valid entry

 */