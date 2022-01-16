package CustomMethodsVoid;

public class PrintEvenNumbers1To100 {



        public static void printEvenNumbers(){

            for (int i = 1; i < 100; i++) {
                if( i % 2 == 0){
                    System.out.print(" " + i);
                }
            }
            System.out.println();
    }
}
