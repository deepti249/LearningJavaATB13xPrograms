package ex_09_If_condition;

import java.util.Scanner;

public class Lab085_If_else_Scanner {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 18) {
            System.out.println("Not allowed to vote!");
        } else {
            System.out.println("Allowed to vote");
        }
    }
}
