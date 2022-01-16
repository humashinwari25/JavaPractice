package NestedIfTernaries;

public class Grade {
    public static void main(String[] args) {
        char grade = 'F';
        if(grade >= 'A' && grade <='F'){
            if(grade =='A'){
                System.out.println("Excellent");
            }else if (grade == 'B'){
                System.out.println("great job");
            }else if (grade == 'C') {
                System.out.println("good");
            }else if (grade == 'D'){
                System.out.println ("passed");
                }else if (grade == 'F'){
                System.out.println("failed");
                }
            }else{
            System.out.println("invalid");
        }

        String grade1 = (grade >= 'A' && grade <='F')?(grade =='A')?"Excellent":
                 (grade == 'B')?"great job":(grade == 'C')?"good":
                         (grade == 'D')? "passed":"failed":"invalid";
        System.out.println(grade1);
    }
}
/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */