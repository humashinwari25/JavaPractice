package CustomMethodsReturn;

public class RemoveElement {
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index < array.length) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
            int[] result = new int[array.length];

            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (i == index) {  // if the index of array is matching with the given index
                    continue; // skip
                }
                result[j++] = array[i];
            }

            return result;



    }
}

/*
	10. create a method named removeElement that passes one integer array and one integer,
	the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2
				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */