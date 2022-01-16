package StringPractice;

import java.util.Scanner;

public class SubstringEndsWithLy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        input.close();
        String lastTwoChar = word.substring(word.length()-2);

        if(lastTwoChar.equals("ly")){
            System.out.println("really???");
        }else
            System.out.println("never mind");

    }
}
/*
2. ask the user to enter a word. if the word ends with "ly",
print "really???" ,  otherwise, print "never mind"

 */