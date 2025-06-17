package ex_08_Increment_Decrement_Operator;

public class Lab078_Advance_Increment_OP {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(a++ + a);

        // A + B
        // A -> a++ -> ExpA -> 10 , a =11
        // +
        // B -> a -> ExpB , ExpB -> 11 , a = 11

        // Line No. |  a |  Exp
        // 5 | 10 | NA |
        // 6 | 11 | 10+11 -> 21
    }
}
