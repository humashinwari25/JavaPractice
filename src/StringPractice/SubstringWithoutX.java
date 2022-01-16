package StringPractice;

import java.util.Scanner;

public class SubstringWithoutX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        input.close();
        if(word.charAt(0) == 'x'){
            System.out.println(word.substring(1));
        }
    }
}
/*
3. Ask user to enter a word. If the work starts with x,
 print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */