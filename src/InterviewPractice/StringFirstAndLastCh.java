package InterviewPractice;

public class StringFirstAndLastCh {

    public static void main(String[] args) {

        String a = "apple";
        String b = "banana";

        System.out.println(a.substring(1));
        System.out.println(b.substring(0,b.length()-1));

    }
}
/*
[Remove first and last]
Given two words. Print the first word without its first character then print the second word
without its last character.
Input:
apple
banana
Output:
pple
banan
 */