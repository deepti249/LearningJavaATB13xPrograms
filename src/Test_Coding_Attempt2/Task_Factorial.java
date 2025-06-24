package Test_Coding_Attempt2;

import java.util.Scanner;

public class Task_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\n Enter the number!");

        if(!scanner.hasNextInt()){   //check if the number is not integer
            System.out.println("Enter the number you fool!");
            return;
        }

        int number = scanner.nextInt();

        long factorial = 1;

        if(number < 0) {
            System.out.println("Negative Factorial is not allowed!");
            return;
        }

        if(number == 0){ //for zero
            System.out.println(factorial);
        }else{
            // Calculate the factorial
            for (int i = 1; i <= number ; i++) {
                factorial = factorial*i;
            }
        }
        System.out.println("Factorial is -> " + factorial);
    }
}
