package Task_3July;

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