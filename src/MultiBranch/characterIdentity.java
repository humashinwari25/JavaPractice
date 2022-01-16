package MultiBranch;

public class characterIdentity {
    public static void main(String[] args) {
/*/* ASCII table
        For capital alphabets 65 – 90  // A ~ Z
        For small alphabets 97 – 122   // 97 ~ 122
        For digits 48 – 57
            */
        int charc = 97;

        if(charc >=48 && charc<= 57){
            System.out.println("digit");
        }else if(charc >= 65 && charc <= 90 || charc >= 48 && charc >= 57){
            System.out.println("alphabetic character");
        }else
        System.out.println("special character");
    }

    public static class EqualNumbers {
        public static void main(String[] args) {
            int n1 = 4;
            int n2= 9;
            int n3 =9;
            if (n1 ==n2 && n2 == n3 && n1==n3){
                System.out.println("all are equal");
            }else if(n1==n2){
                System.out.println("n1&n2n2 are equal");
            }else if(n2==n3){
                System.out.println("n2&n3 are equal");
            }else if(n1==n3){
                System.out.println("n3&n1 are equal");
            }else
                System.out.println("none of them are equal");
        }
    }
}
/*
4. Create a class called
 Character Identity, and write a program that can identify
 if the given character is a digit or Alphabetic Character
 (A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the
		chracters on ASCII table
 */