package Switch_Scanner;

import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String result = "";

        System.out.println("Please enter hourly Rate:");
        int hourlyRate =input.nextInt();

        System.out.println("Hours worked in a week:");
        int hoursWorked =input.nextInt();

    input.nextLine();

        System.out.println("Enter state tax in percentage:");
        double stateTax = input.nextDouble();

        System.out.println("Enter Federal Tax in percentage:");
        double federalTax =input.nextDouble();


        double salary = hourlyRate * hoursWorked * 52;//52 weeks in a year
        double federalTax1 = salary * federalTax/100; //in order to convert to percentage to decimal value; mathematical formual
        double stateTax1= salary * stateTax /100;//
        double totalTax = stateTax1 + federalTax1;
        double netIncome = salary- totalTax;

        System.out.println("salary - " + salary );
        System.out.println("stateTax - " + stateTax1);
        System.out.println("federalTax - " + federalTax1);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);
input.close();
    }
}
/*
3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate-will use double
            3.2 Ask the user how many hours he/she works in a week-
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary -
                    3.4.2 sateTax -
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */