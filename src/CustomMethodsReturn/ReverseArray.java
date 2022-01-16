package CustomMethodsReturn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int [] arr2 = reverse(arr);

        System.out.print(Arrays.toString(arr2));
    }
    public static int[] reverse(int[] array){



     int[] result =new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
                result[j] = array[i];
        }
        return result;
    }
}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array
				Ex:
					arr = {10, 20, 30, 40};
					reverse(arr) ==> {40, 30, 20, 10}
 */