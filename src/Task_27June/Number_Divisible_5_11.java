package Task_27June;

//Check if a Number is Divisible by 5 and 11

import java.util.Scanner;

public class Number_Divisible_5_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");

        if(!sc.hasNextInt())
        {
            System.out.println("Please enter valid no.!");
        }else {
            int num = sc.nextInt();
            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println("Number is divisible by 5 and 11");
            } else {
                System.out.println("Number is not divisible by 5 and 11");
            }
        }
        sc.close();
    }
}
