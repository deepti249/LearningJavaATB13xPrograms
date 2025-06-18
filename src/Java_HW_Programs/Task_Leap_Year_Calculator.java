package Java_HW_Programs;

/*Leap Year Checker:

Create a program that determines whether a given year is a leap year. A leap year is
divisible by 4, but not by 100 unless it is also divisible by 400. Use an if-else
statement to make this determination.*/

import java.util.Scanner;

public class Task_Leap_Year_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check leap year condition
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " is a Leap Year.");
        } else
        {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}
