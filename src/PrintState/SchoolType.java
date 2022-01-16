package PrintState;

public class SchoolType {
    public static void main(String[] args) {
        int gradeLevel = 5; //(1-18)

        boolean elemSchool = gradeLevel >= 1 && gradeLevel <=5;
        boolean middSchool = gradeLevel >= 6 && gradeLevel <=8;
        boolean highSchool = gradeLevel >= 9 && gradeLevel <=12;
        boolean college = gradeLevel >= 13 && gradeLevel <=16;
        boolean gradSchool = gradeLevel >=17 && gradeLevel <=18;

        if (elemSchool) {
            System.out.println("elemSchool = " + elemSchool);
        }
        if(middSchool) {
            System.out.println("middSchool = " + middSchool);
        }
        if(highSchool) {
            System.out.println("highSchool = " + highSchool);
        }
        if(college) {
            System.out.println("college = " + college);
        }
        if(gradSchool) {
            System.out.println("gradSchool = " + gradSchool);
        }

    }



}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
 */