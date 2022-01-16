package MultiBranch;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber = 3; //1~6;
        if(gradeNumber == 1){
            System.out.println("grade - 1" + "\n" +"location - Apple orchard" + "\n"+
                    "Number of groups - 3" + "\n" + "teacher in charge - Ms.Smith");
        }else if(gradeNumber == 2){
                System.out.println("grade - 2" + "\n" +"location - Zoo" + "\n"+
                        "Number of groups - 7" + "\n" + "teacher in charge - Mr.Lee");
            }else if(gradeNumber == 3){
                System.out.println("grade - 3" + "\n" +"location - Aquarium" + "\n"+
                        "Number of groups - 5" + "\n" + "teacher in charge - Ms.Wilson");
            }else if(gradeNumber == 4){
                System.out.println("grade - 4" + "\n" +"location - Movie Theater" + "\n"+
                        "Number of groups - 2" + "\n" + "teacher in charge - Ms.Reyes");
            }else if(gradeNumber == 5){
                System.out.println("grade - 5" + "\n" +"location - Museium" + "\n"+
                        "Number of groups - 5" + "\n" + "teacher in charge - Ms.Lela");
        }else if(gradeNumber == 6) {
            System.out.println("grade - 6" + "\n" + "location - Six Flags" + "\n" +
                    "Number of groups - 8" + "\n" + "teacher in charge - Mr. Watt");
        }
        }
}
/*
8. Create a class called ElseIF.FieldTrip. Your school goes on a
Field trip each year. The place you go will be based on your
grade. Given a variable gradeNumber (1-6) figure out the details
of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */