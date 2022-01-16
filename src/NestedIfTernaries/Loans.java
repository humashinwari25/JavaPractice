package NestedIfTernaries;

public class Loans {
    public static void main(String[] args) {
        int salary = 66000;
        int creditScore = 647;

        if(salary >60000 && creditScore > 650){
            System.out.println("Loan Approved");
        }else {
            System.out.println("Loan Denied");
        }
      String result =  salary >60000 && creditScore > 650? "Loan Apprsoutvoved":"Loan Denied";
        System.out.println(result);

    }
}
/*
6. Create a class called Loans,
Given two variables salary and credit score,
 use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */