package Task_3July;

/*
Task 5: Find Maximum
Title: Find max using overloaded functions
Description:
Create a class Utility with two methods named max():
max(int a, int b) returns the larger of two integers
max(int a, int b, int c) returns the larger of three integers
max(double a, double b) returns the larger of two decimal values
Add method calls in main() to compare different types.
 */

public class Method_Overload_Find_Maximum {
    public static void main(String[] args)
    {
        Utility u1 = new Utility();

        u1.max(7,4);

        u1.max(5,9,2);

        u1.max(5.76,9.25);
    }
}

class Utility
{
    int max(int a, int b) {
        System.out.println("Largest of 2 No's with int datatype:");
        int max = (a > b) ? a : b;
        System.out.println(max + " is largest number!");
        return max;
    }

    int max(int a, int b, int c) {
        System.out.println("Largest of 3 No's with int datatype:");
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max + " is largest number!");
        return max;
    }

    double max(double a, double b) {
        System.out.println("Largest of 2 No's with double datatype:");
        double max = (a > b) ? a : b;
        System.out.println(max + " is largest number!");
        return max;
    }
}
