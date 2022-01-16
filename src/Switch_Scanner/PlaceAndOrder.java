package Switch_Scanner;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name:");
        String productName = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter First Name: ");
        String name = input.next();

        System.out.println(name + ", your order for " + quantity + " " + productName + " has been placed. Your total is $" + price + ".");

input.close();
}
   }
   /*
   6. PlaceAnOrder task:
  Ask User to enter the prodcut name (multiple words)
    Ask the user to enter the price  (double)
   Ask the user to enter the quantity (int)
   Ask the user to enter their first name (String, single word)

          Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

        Output:
 Luke, your order for 5 Apples has been places. Your total is 7.5.
    */