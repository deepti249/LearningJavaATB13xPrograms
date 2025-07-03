package Task_3July;

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