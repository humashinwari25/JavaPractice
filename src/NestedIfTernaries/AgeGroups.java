package NestedIfTernaries;

public class AgeGroups {
    public static void main(String[] args) {
      int age = 72;
      if(age >=0 && age <=150){
          if(age < 21){
              System.out.println("teenager");
          }else if(age >= 21 && age < 55){
              System.out.println("adult");
          }else{
              System.out.println("senior");
          }
      }else{
          System.out.println("invalid");
      }
      String age1 =  (age >=0 && age <=150)?(age < 21)?"teenager":
                (age>=21 && age < 55)?"adult":"senior":"invalid";
        System.out.println(age1);
    }
}
/*
4. Create a class called AgeGroups,
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

if age is negative or greater than 150, print invalid

   NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */