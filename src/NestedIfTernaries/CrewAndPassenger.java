package NestedIfTernaries;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number = 50;
        if (number == 50 || number == 75 || number == 100) {
            if (number == 50) {
                System.out.println("20 crew, 30 passengers");
            } else if (number == 75) {
                System.out.println("25 crew, 50 passengers");
            } else {
                System.out.println("30 crew, 70 passengers");
            }
        } else {

            System.out.println("Not Valid");
        }
        System.out.println("-----------------------");
        //ternary;
      String number1 = (number == 50 || number == 75 || number == 100)?(number == 50)?
        "20 crew, 30 passengers":(number == 75)? "25 crew, 50 passengers":
       "30 crew, 70 passengers":"Not Valid";
        System.out.println(number1);


}
}
/*
2. Create a class called CrewAndPassanger, Given a number of people on
the ship (int number), determine how many need to be crew members
and how many can be passengers. Print how many of each type there
should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */