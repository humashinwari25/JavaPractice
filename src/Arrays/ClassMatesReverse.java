package Arrays;

import java.util.Arrays;

public class ClassMatesReverse {
    public static void main(String[] args) {

        String [] classMates = {"Huma Shinwari", "Sonia Mirza", "RAul Kaet",
                "Valerie Mac", "Macy Mcintosh", "Brooks Field", "Apple Long","Martin Jor",
                "Ricardo Ricky", "Tom Hanks"};


        for (int i = 0; i < classMates.length; i++) {
            String name = classMates[i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);
        }

    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in
            separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c
 */