package StringPractice;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String emailAdd = input.next();//huma_shin@yahoo.com

        if(emailAdd.contains("_")){
            String firstName = emailAdd.substring(0,emailAdd.indexOf("_"));
            String lastName = emailAdd.substring(emailAdd.indexOf("_")+1,emailAdd.indexOf("@"));
            String emailDomain = emailAdd.substring(emailAdd.indexOf("@")+1);
            System.out.println(""+ lastName + "_" + firstName +"@"+ emailDomain);
        }else{
            System.out.println(emailAdd);
        }
        input.close();
    }

}
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */