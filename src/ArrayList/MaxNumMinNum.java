package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumMinNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        int max = list.get(0);
        int min = list.get(0);

        for (int each: list) {
            if(each > max){
                max = each;
        }
        }
        for (int each:list) {
            if(each < min){
                min = each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
6.Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */