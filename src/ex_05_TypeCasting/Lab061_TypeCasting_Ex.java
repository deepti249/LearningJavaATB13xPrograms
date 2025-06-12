package ex_05_TypeCasting;

import java.sql.SQLOutput;

public class Lab061_TypeCasting_Ex {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
      //  int total = course + GST ; //Narrowing ->Implicit is not allowed
        int total1 = course+(int)GST; // Narrow - Explict
        System.out.println(total1);

        float total2 = course + GST; // Widening - auto - implicit
        System.out.println(total2);

        float total3 = (float)course + GST; // Widening  - Explicit
        System.out.println(total3);

    }
}
