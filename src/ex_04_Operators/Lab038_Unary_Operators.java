package ex_04_Operators;

public class Lab038_Unary_Operators {
    public static void main(String[] args) {
        int a = +10;   //int a = 10;
        System.out.println("Value of a is : " + a);
        int a1 = -110;
        System.out.println("Value of a1 is : " + a1);
        int result = a + a1;
        System.out.println("Value of result is : " + result);

        int b = -1;
        b = b + 1;
        System.out.println("Value of b is : " + b);
    }
}
