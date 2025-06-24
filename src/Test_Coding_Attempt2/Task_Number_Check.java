package Test_Coding_Attempt2;

import java.util.Scanner;

public class Task_Number_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        // Check if number is positive, negative, or zero
        if(num > 0){
            System.out.println(num + " is a positive integer");
        } else if (num < 0) {
            System.out.println(num + " is a negative integer");
        }else{
            System.out.println(num + "is zero");
        }
        scanner.close();
    }
}
