package CustomMethodsReturn;

public class Merge {


    public static int[] merge(int[] array, int[] array2) {

        int[] result = new int[array.length + array2.length];
        int i = 0;

        for (int each : array) {
            result [i++] = each;
        }
        for (int each :array2) {
            result [i++] = each;
        }
        return result;
    }


}

/*
	7. Create a method named merge that passes two integer array parameters,
	the method can merge two integer arrays and return the new array
				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}
					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */