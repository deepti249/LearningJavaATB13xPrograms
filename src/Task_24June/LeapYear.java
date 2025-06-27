package Task_24June;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        // Check if a Year is a Leap Year.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = scanner.nextInt();

        if((year % 4 ==0) && (year% 100 !=0) || (year % 400 ==0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
