package Test_Coding1;

import java.util.Scanner;

public class Task_Max_Three_No {
    public static void main(String[] args) {
        // Find the maximum between the three numbers.
        // Now we will be using the logic building formula.

        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.println(max);
    }
}
