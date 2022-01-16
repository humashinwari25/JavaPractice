package StringPractice;

import java.util.Scanner;

public class UserInitials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your last name: ");
        String lastName = input.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        System.out.println(f + "." + l );
input.close();
    }
}
/*
2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */