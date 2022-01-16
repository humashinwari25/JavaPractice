package Switch_Scanner;

import java.util.Scanner;

public class PeopleLiveWith {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how many people do you live with: ");
        int liveWith = input.nextInt();

        if(liveWith<3){
            System.out.println("Live with Less than 3 people");
        }else if(liveWith >=3 && liveWith <= 6){
            System.out.println("Live with 3 - 6 people");
        }else{
            System.out.println("Live with more than 6 people");
        }
input.close();
    }
}
/*
1. Ask the user how many people they live with:
   if user lives with Less than 3 people:
   print "Live with less than 3 people"

  if the user lives with 3 - 6 people:
  print "Live with 3 - 6 people"

 if the user lives with more than 6 people:
 print "Live with "more than 6 people"
 */