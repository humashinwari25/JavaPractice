package NestedIf_Switch;

public class Browser2 {
    public static void main(String[] args) {

        String browserName = "google";
        boolean validBrowser = browserName == "chrome" || browserName == "firefox"
                || browserName == "Opera" || browserName == "safari" || browserName == "edge";
        if(validBrowser){
            switch(browserName){
                case "chrome":
                    System.out.println("Chrome browser is selected");
                    break;
                case "firefox":
                    System.out.println("Firefox browser is selected");
                    break;
                case "Opera":
                    System.out.println("Opera browser is selected");
                    break;
                case "Safari":
                    System.out.println("Safari browser is selected");
                    break;
                default:
                    System.out.println("Edge browser is selected");
                    break;
            }
        }else{
            System.out.println("Invalid Browser");
        }
    }
}
/*
 nested if---String browserName = "chrome";
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

   3.  write a program that can display the selected browser
            3.1  declear a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */