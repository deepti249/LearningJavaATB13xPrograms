package ex_30_Exceptions;

import java.util.Scanner;

public class Lab234_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("You are a minor, Can't go to GOA!");
        }
    }
}
