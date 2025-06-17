package ex_08_Increment_Decrement_Operator;

public class Lab077_IN_OP_POST {
    public static void main(String[] args) {
        int a = 10;
        int result = a++; //10
        System.out.println(a); // 10+1 -> 11
        System.out.println(result); //10

        // Line No. |  a | Exp
        //  5 |  10 | NA
        //  6 |  11 | 10
        //  7 |  11 | NA
        //  8 | NA | 10

    }
}
