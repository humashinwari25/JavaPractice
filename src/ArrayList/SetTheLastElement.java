package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetTheLastElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5)); //adding multiple elements to arrayList at once using bulk operations

        list.set(list.size()-1, 0);

        System.out.println(list);
    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
 */