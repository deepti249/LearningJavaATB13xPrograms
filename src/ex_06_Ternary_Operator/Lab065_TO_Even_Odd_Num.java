package ex_06_Ternary_Operator;

public class Lab065_TO_Even_Odd_Num {
    public static void main(String[] args) {
        int num = 13;
        String result = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(result);
    }
}
