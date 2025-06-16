package ex_07_UserInput;

import java.util.Scanner;

public class Lab071_UserInput_Scanner_Exception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");

        int age = scanner.nextInt();
        //If we pass String or float or double as input then it will throw
        // "InputMismatch" Exception bcoz we are using nextInt method of Scanner class.
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);
    }

}
