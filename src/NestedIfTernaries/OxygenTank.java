package NestedIfTernaries;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygen = 50;

        if (oxygen >= 0 && oxygen <= 100) {
            if (oxygen >= 90 && oxygen <= 100) {
                System.out.println("Your tank is full");
            } else if ( oxygen >= 80 && oxygen <= 89) {
                System.out.println("still ok");
            } else if (oxygen >= 70 && oxygen <= 79) {
                System.out.println("Dont go too far");
            } else if (oxygen >= 60 && oxygen <= 69) {
                System.out.println("Start to head back");
            } else if (oxygen >= 50 && oxygen <= 59) {
                System.out.println("Be carefull now you at 50%");


            }
        } else {
            System.out.println("Invalid");
        }
        System.out.println("---------------------------------");
        //ternary

     String output  = (oxygen >= 0 && oxygen <= 100)? (oxygen >= 90 && oxygen <= 100)? "Your tank is full"
             :(oxygen >= 80 && oxygen <= 89)? "Still Ok"
             :(oxygen >= 70 && oxygen <= 79)? "Dont go too far"
             :(oxygen >= 60 && oxygen <= 69)?"Start to head back"
             :"Be carefull now you at 50%" : "Invalid";

        System.out.println(output);
    }
}

/*
4. Create a class called NestedIfTernaries.OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you  at 50%

                USE ONE PRINT STATEMENT ONLY
 */