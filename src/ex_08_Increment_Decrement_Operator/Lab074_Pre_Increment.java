package ex_08_Increment_Decrement_Operator;

public class Lab074_Pre_Increment {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(b); //10 + 1 -> 11
        System.out.println(a); //11

        //  Exp and Result Table
        // Line No | a | Result b
        //  5 |  10 |  NA
        // 6 |  11 |  11
        // 7 | 11(NA) | 11
        // 8 | 11 | 11(NA)

    }
}
