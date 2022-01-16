package NestedIfTernaries;
public class Browser {
    public static void main(String[] args) {
        String browserName = "chrome";
        String result = "";
       // boolean validbrowser =
        if(browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge"){
            if(browserName == "chrome"){
                System.out.println("Chrome Browser is selected");
            }else if (browserName == "firefox"){
                System.out.println("Firefox browser is selected");
        }else if (browserName == "Opera") {
                System.out.println("Opera browser is selected");
            }else if(browserName == "Safari") {
                System.out.println("Safari browser is selected");
            }else  {
            System.out.println("edge browser is selected");
        }
    } else{
            System.out.println("Invalid Browser");
        }
    }
}
/*
1. Create a class called Browser. Write a program that can
display the name of selected browser
  1. declare a String variable named browserName
  2. Assume that the valid browsers are: chrome, firefox, opera,
  safari, edge.
  3. if the browser name does not match with the valid browser names,
  out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
 */