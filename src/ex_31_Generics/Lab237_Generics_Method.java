package ex_31_Generics;

public class Lab237_Generics_Method {
    public static void main(String[] args) {
        display(3,4);
        display(3.14,4.45);
        display("pramod","dutta");
        display1(3,4, 5);
    }

    static <T> T display1(T a,T b, T c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return null;
    }


    static <T> void display(T a,T b) {
        System.out.println(a);
        System.out.println(b);
    }

    /*static void display(int a,int b) {
        System.out.println(a);
        System.out.println(b);
    }*/
}
