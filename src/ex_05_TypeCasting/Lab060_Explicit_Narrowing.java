package ex_05_TypeCasting;

public class Lab060_Explicit_Narrowing {
    public static void main(String[] args) {
        long phone = 9876543210l;
    // short s = phone; // Implicit Narrow
        short s1 = (short)phone; // Explicit Narrow
        System.out.println(s1);
    }
}
