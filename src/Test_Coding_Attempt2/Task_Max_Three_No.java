package Test_Coding_Attempt2;
// Find the maximum between the three numbers.

import java.util.Scanner;

public class Task_Max_Three_No {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second number : ");
        int n2 = scanner.nextInt();

        System.out.println("Enter the third number : ");
        int n3 = scanner.nextInt();

        int max = (n1 > n2) ? (n1>n3) ? n1 : n3 : (n2 > n3) ? n2 : n3 ;
        System.out.println(max);

        scanner.close();
    }
}
