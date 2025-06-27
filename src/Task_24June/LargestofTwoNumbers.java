package Task_24June;

import java.util.Scanner;

public class LargestofTwoNumbers {
    public static void main(String[] args) {
        //Find the Largest of Two Numbers.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First No ");
        int a = scanner.nextInt();
        System.out.println("Enter the Second No ");
        int b = scanner.nextInt();

        if(a>b)
        {
            System.out.println(a + " is Largest");
        }
        else
        {
            System.out.println(b+ " is Largest");
        }



    }
}
