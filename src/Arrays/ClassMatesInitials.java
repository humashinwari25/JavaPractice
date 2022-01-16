package Arrays;


import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {

        String [] names = {"Huma Shinwari", "Sonia Mirza", "RAul Kaet",
        "Valerie Mac", "Macy Mcintosh", "Brooks Field", "Apple Long","Martin Jor",
        "Ricardo Ricky", "Tom Hanks"};


        System.out.println(Arrays.toString(names));

       for (int i = 0; i < names.length; i++) {
          String namesInitials = ""+ names[i].charAt(0) + "." +
                  names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println( namesInitials);


        }


        }



    }

/*
1. create an array named classmates, and store 10 of your
classmates' full names
            print the initials of each classmates in separate lines

 */