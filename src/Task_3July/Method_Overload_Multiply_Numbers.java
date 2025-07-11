package Task_3July;

/*
 Task 3: Multiply Numbers
Title: Multiply using overloaded methods
Description:
Create a class MathOperations with two multiply() methods:
One takes two integers and returns the product
Another takes three integers and returns their product
This helps students understand how Java distinguishes methods based on parameter count.
 */

public class Method_Overload_Multiply_Numbers {
    public static void main(String[] args)
    {
        MathOperations mo =new MathOperations();
        mo.multiply(10,20);
        mo.multiply(10,20,30);
    }
}

class MathOperations
{
    int multiply(int a, int b)
    {
        int c= a*b;
        System.out.println(c);
        return c;
    }

    int multiply(int a, int b,int c)
    {
        int d= a*b*c;
        System.out.println(d);
        return d;
    }
}