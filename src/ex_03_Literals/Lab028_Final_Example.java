package ex_03_Literals;

public class Lab028_Final_Example {
    public static void main(String[] args) {
        int local = 10;
        System.out.println(local);

        final float pi = 3.14f;
        //pi = 3.14f is final in nature. Its value is constant and cannot be changed.
        System.out.println(pi);
    }
}
