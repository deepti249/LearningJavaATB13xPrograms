package ex_05_TypeCasting;

public class Lab058_TypeCasting_Explicit {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //widening -> Implicit casting
        int a1 = (int)b ; //Widening -> Explicit casting
        /*By default, JVM performs explicit casting in case of widening.
         So, we only use implicit casting in widening.*/
        System.out.println(a1);
    }
}
