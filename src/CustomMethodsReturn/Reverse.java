package CustomMethodsReturn;

public class Reverse {
    public static void main(String[] args) {
       String s1 = reverse("java");
        System.out.println(s1);

    }
    public static String reverse(String str){

        String result ="";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;

    }
}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string
				Ex:
					str = "Java";
					reverse(str) ==> avaJ
 */