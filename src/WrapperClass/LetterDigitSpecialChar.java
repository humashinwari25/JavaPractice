package WrapperClass;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {

        String str = "Wo5oden Spoon!";

        String letters = "";
        String digits = "";
        String specialChar = "";

        for (int i = 0; i < str.length() ; i++) {
            char each = str.charAt(i);
            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChar += each;
            }
        }
        System.out.println("specialChar = " + specialChar);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"
		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */