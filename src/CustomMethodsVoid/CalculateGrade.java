package CustomMethodsVoid;

public class CalculateGrade {

    public static void calculateGrade(int score){

        String grade = "invalid";

        if(score >= 0 && score <= 100 ){
         grade =    (score >=90)?"A":(score >=80)?"B":(score >=70)?"C":(score >=60)?"D":"F";
        }

        System.out.println("grade = " + grade);
    }
}
/*
5. create a method that can calculate the grade of the student based on the score
 */