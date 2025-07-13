package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {

        P p1 = new P();
        P p2 = new P();

        System.out.println(P.a); //Static variable can be accessed using Class name directly
        System.out.println(p1.a);//10
        System.out.println(p2.a);//10
        System.out.println("--------------------");

        p1.a = 12;
        System.out.println(P.a); //12
        System.out.println(p1.a);//12
        System.out.println(p2.a);//12
        System.out.println("--------------------");

        p2.a = 20;
        System.out.println(P.a); //20
        System.out.println(p1.a);//20
        System.out.println(p2.a);//20
        System.out.println("--------------------");

        // System.out.println(P.b); //not possible
        p1.b = 24;
        p2.b = 34;
        System.out.println(p1.b); //24
        System.out.println(p2.b); //34

    }
}

class P{
    static int a = 10; //common value for all the instance variable

    int b = 10;

    static {
        // This is static block.
        // This is called whenever a class a loaded.
        System.out.println("Hi, I am static block.... I get called whenever a class is loaded");

        // The usage of static block is to call some of the methods as soon as a class is loaded
        // like calling a database connection, calling an Excel collection

    }
}