package NestedIfTernaries;

public class BiggerNum {
    public static void main(String[] args) {
        int n1 = 93;
        int n2 = 17;
        int n3 =29;
        if(n1>n2 && n1>3){
            System.out.println("n1 is bigger");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("n2 is bigger");
        }else {
            System.out.println("n3 is bigger");
        }
       String output = n1>n2 && n1>3?"n1 is bigger":n2 > n1 && n2 > n3?"n2 is bigger":"n3 is bigger";
        System.out.println(output);
    }
}
/*
5. Create a class called BiggerNum,
write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */