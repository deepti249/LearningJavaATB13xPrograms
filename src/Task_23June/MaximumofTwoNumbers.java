package Task_23June;

import java.util.Scanner;

public class MaximumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First num ");
        int a = scanner.nextInt();
        System.out.println("Enter Second num");
        int b = scanner.nextInt();

        if(a>b)
        {
            System.out.println(a + " is Maximum");
        }
        else
        {
            System.out.println(b + " is Maximum");
        }
    }
}
