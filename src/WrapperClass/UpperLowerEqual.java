package WrapperClass;

public class UpperLowerEqual {

    public static void main(String[] args) {

        String str = "JAVA javas";

        int countUpperCase = 0;
        int countLowerCase = 0;

        for (int i = 0; i <str.length(); i++){
            char each = str.charAt(i);
            if(Character.isLowerCase(each)){
                countLowerCase++;
            }
            if(Character.isUpperCase(each)){
                countUpperCase++;
            }
        }
        boolean result = countLowerCase == countUpperCase;
        System.out.println( result);
    }
}
/*
4. Write program that returns true if the total number of upper case characters are
equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";
		output:
			true
 */