package NestedIfTernaries;

public class CampusTime {
    public static void main(String[] args) {
        int time =10; //1-24
        //first make a precondition, which is  to be a valid number from 1-24;
        if(time>=1 && time<=24){//valid number
            if(time >= 8 && time<=23){
                System.out.println("Open");
            }else{
                System.out.println("closed");
        }
    } else {
        System.out.println("Invalid Time");
    }
        System.out.println("-----------------------------------");
       int time1 = 12;
        String result = (time>=8 && time <=23)? "open":"closed";
        System.out.println(result);
}
}
/*
1.  Create a class called NestedIfTernaries.CampusTime, an integer variable named time is given with a
number between 1~24 has been initialized, write a program that can find out if the
campus is open or not. Campus is open from 8 am(8) to 11 pm (23) If user enters a time
within the open time they should see message: “open”  but if the time entered is outside
of operating hours they should see: “ closed”

 */