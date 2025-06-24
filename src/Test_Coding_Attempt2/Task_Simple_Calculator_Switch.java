package Test_Coding_Attempt2;

import java.util.Scanner;

public class Task_Simple_Calculator_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1, number2, result ;

        char operator;

        System.out.println("Enter first number");
        number1 = scanner.nextDouble();

        System.out.println("Enter second number");
        number2 = scanner.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = scanner.next().charAt(0);

        switch (operator){

            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        scanner.close();
    }


}
