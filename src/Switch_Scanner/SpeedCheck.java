package Switch_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String speedLimit = "";


        System.out.println("Enter current Speed: ");
        int currentSpeed = input.nextInt();

        int speedOver = currentSpeed - 55;

        if(currentSpeed > 55){
            System.out.println("You're driving " + speedOver + " mph over the limit. Slow down!" );
        }
        System.out.println();

input.close();

    }
}
/*
2. Write a program for the speed check.
a variable named speedLimit is given and assigned,
ask user to enter the current speed, if the current speed
is over the speedLimit print slow down, otherwise do not
print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */