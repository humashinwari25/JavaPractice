package StringPractice;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Split or no Split(YES or NO)");
        String splitNOSplit = input.nextLine().toLowerCase();
        System.out.println("Enter the number of people: ");
        int numOfPeople = input.nextInt();
        System.out.println("Enter check amount:");
        double checkAmount = input.nextDouble();
       input.nextLine();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)\n" +
                "\t\tExcellent");
        String service = input.next().toLowerCase();
        double tipRate =(service.equals("excellent"))? 0.25 : (service.equals("great"))? 0.2 :
                (service.equals("good"))? 0.15 :(service.equals("fair"))? 0.1 :0.05;

        double totalTip = checkAmount * tipRate;

        System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: " + checkAmount);
        System.out.println("Total tip: " + totalTip);

        if( splitNOSplit.equals("yes") ) {
            System.out.println("Total per person: " + (checkAmount / numOfPeople));
            System.out.println("Tip per person: " + (totalTip / numOfPeople));
        }
input.close();

    }
}
/*
2. Create a class called TipCalculator, write a program for a
tip calculator. There will be different service quality benchmarks
 that will determine the tip given. There will also the ability to
 calculate based on the number of people in the party and if there
 is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%,
		Excellent = 25%

	The program should display the following information based
	on the user input:

	Split or No split (Yes or No),  Number of people entered:
	(number) (each person = & in output) Check amount: (number)
	 Service Quality: (String) Total to pay: Total tip: Total
	  per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */