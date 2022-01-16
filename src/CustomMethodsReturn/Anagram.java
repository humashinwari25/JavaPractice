package CustomMethodsReturn;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2){

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1,char2);
    }

}
/*
 2. create a method named isAnagram that passes two String parameters,
  the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";
    				isAnagram(str1, str2) ====> true
 */