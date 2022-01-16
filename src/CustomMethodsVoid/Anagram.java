package CustomMethodsVoid;

import java.util.Arrays;

public class Anagram {
    public static void anagram(String word1, String word2){

        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char2, char2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("NOt Anagrams");
        }

    }

}
/*
    16. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")
			output:
				silent and listen are anagram
 */