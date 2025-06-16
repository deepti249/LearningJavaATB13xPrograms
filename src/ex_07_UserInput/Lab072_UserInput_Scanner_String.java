package ex_07_UserInput;

import java.util.Scanner;

public class Lab072_UserInput_Scanner_String {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        //double
        System.out.println("Enter double ");
        double sc = scanner.nextDouble();
        System.out.println(sc);
    }


}
