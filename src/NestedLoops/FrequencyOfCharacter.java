package NestedLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
       String str = "aabcccd";
       String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;

            for (int j = 0; j <str.length() ; j++) {
                char ch = str.charAt(j);

                if(each == ch){
                    count++;
                }

            }
            if (result.contains(""+each ) ){
                continue;
            }
         result += each;
            result += count;
        }
        System.out.println(result);

    }
}
/*
4. Write a program that can find the frequency of the
characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
        Hint: if you find out how to find the frequency of one
         character, then repeat it for all the remaining characters
 */