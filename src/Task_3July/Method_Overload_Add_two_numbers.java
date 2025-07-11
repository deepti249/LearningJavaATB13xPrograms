package Task_3July;

/* Task 1: Add Two Numbers
Title: Overload a method to add different types of numbers
Description:
Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
The int version should add two integers.
The double version should add two decimal numbers.
In the main method, call both versions to demonstrate how overloading works with data types.
*/

public class Method_Overload_Add_two_numbers {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);
        c.add(10.50, 20.40);
    }
}

class Calculator {
    int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    double add(double a, double b)
    {
        System.out.println(a+b);
        return a+b;
    }
}