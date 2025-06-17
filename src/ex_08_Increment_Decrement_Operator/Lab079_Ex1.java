package ex_08_Increment_Decrement_Operator;

public class Lab079_Ex1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a); //10+12 -> 22
        System.out.println(a); //12

        // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
    }
}
