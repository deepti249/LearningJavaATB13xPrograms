package Task_14July;

public class Question_7 {
    public static void main(String[] args)
    {
        int a = 110;

        int b = a--;

        System.out.println("the value of b is " +b);

        int d = --a;

        System.out.println("the value of D is " + d);

        System.out.println("the value of A is " +a);

        int l= b--;

        System.out.println("the value of l is " +l);

        System.out.println("the value of b is " +b);

        int s = d-- + --b;

        System.out.println("the value of S is " +s);

        s = --d + --b;

        System.out.println("the value of S is " +s);

        System.out.println("the value of b is " +b);

        System.out.println("what will be the value of b "+ b++);

        System.out.println("what will be the value of b "+ ++b);

        System.out.println("what will be the value of b "+ b--);

        System.out.println("what will be the value of b "+ --b);
    }
}
