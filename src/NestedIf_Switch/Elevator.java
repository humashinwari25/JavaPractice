package NestedIf_Switch;

public class Elevator {
    public static void main(String[] args) {

       int floorNum = 2;
        String result = "";
       //nested if
        if (floorNum >= 1 && floorNum <= 3) {
            if (floorNum == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            } else if (floorNum == 2) {
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            } else if (floorNum == 3) {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }

        } else {
            System.out.println("Invalid floor - 6");
        }
       System.out.println("----------------------------------------");
      //switch
        int floorNumSwitch = 7;
        String result1 = "";
        switch (floorNumSwitch) {

            case 1:
                result1 = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;

            case 2:
                result1 = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;

            case 3:
                result1 = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;

            default:
                result1 = "Invalid floor - 6";
        }
        System.out.println(result1);
        System.out.println("----------------------------------------");

      //if & switch
        int floorNumIf_Switch = 9;
        String result2 = "";
        if (floorNumIf_Switch >=1 && floorNumIf_Switch <=3) {
            switch (floorNumIf_Switch) {

                case 1:
                    result2 = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;

                case 2:
                    result2 = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;

                default:
                    result2 = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                    break;
            }

        }else{
            System.out.println("Invalid floor - 6");
        }
        System.out.println(result2);

    }
}
/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */