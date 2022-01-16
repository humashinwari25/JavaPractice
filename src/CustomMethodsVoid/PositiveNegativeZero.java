package CustomMethodsVoid;

public class PositiveNegativeZero {

    public static void posNegZero(int num){

        String result = (num> 0)?"positive":(num<0)?"negative":"zero";
        System.out.println("result = " + result);
    }
}
/*
	11. create a method that can if the given integer is positive, negative or zero
 */