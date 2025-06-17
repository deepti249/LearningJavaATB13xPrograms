package ex_10_Switch_Case;

import java.util.Scanner;

public class Lab090_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

//        String browser = args[0];
//        System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser name which you want to start!!");
        String browser = scanner.next();
        browser  = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firefox(); // Selenium Code
                break;

            case "edge":
                System.out.println("Execute the Edge Code");

            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
