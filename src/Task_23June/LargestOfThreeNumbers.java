package Task_23June;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First num ");
        int a = scanner.nextInt();
        System.out.println("Enter Second num");
        int b = scanner.nextInt();
        System.out.println("Enter Third num");
        int c = scanner.nextInt();

        if(a>b)
        {
            System.out.println(a + " is Largest");
        }
        else if (b>c)
        {
            System.out.println(b + " is Largest");
        }else
        {
            System.out.println(c + " is Largest");
        }
    }
}
