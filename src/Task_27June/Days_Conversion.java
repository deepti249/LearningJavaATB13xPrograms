package Task_27June;

/*
Convert Days into Years, Months, and Days.
*Take the Days Input from the User
Define the conversion logic:
Assume 1 year = 365 days.
Assume 1 month = 30 days
Convert the Days into Years, Month and days and Print it.
if you input 1000 days, the output of the program would be: 2 years, 9 months, and 0 days.
 */

import java.util.Scanner;

public class Days_Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of days");

        if(!sc.hasNextInt())
        {
            System.out.println("Enter valid days!");
        }else {
            int total_days=sc.nextInt();

            if(total_days<0)
            {
                System.out.println("Please enter positive days");
            }else {
                int year=total_days / 365;
                int remaining_days= total_days % 365;
                int months= remaining_days / 30;
                int days= remaining_days % 30;
                System.out.println("Total days: " + year + " years," + months + " months," + days + " days.");
            }
        }
    sc.close();
    }
}
