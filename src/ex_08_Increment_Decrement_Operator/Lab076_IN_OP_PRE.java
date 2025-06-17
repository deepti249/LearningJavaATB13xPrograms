package ex_08_Increment_Decrement_Operator;

public class Lab076_IN_OP_PRE {
    public static void main(String[] args) {
        int a = 10;
        int result = ++a; // 10 + 1 -> 11
        System.out.println(a); //11
        System.out.println(result); //11

        // Line No. |  a | Exp
        //  5 |  10 | NA
        //  6 |  11 | 11
        //  7 |  11 | NA
        //  8 | NA | 11
    }
}
