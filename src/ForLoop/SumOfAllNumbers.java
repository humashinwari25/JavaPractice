package ForLoop;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        if (num < 0) {
            System.out.println("Invalid");
        } else {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
/*
3. write a program that can calculate the sum
of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */