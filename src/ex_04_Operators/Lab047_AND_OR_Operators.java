package ex_04_Operators;

public class Lab047_AND_OR_Operators {
    //&& -> AND operator
    // || -> OR operator

    public static void main(String[] args) {
        System.out.println(true && true); // 1 && 1 -> 1
        System.out.println(true && false);// 1 && 0 -> 0
        System.out.println(false && true);// 0 && 1 -> 0
        System.out.println(false && false);// 0 && 0 -> 0

        System.out.println(true || true); // 1 || 1 -> 1
        System.out.println(true || false);// 1 || 0 -> 1
        System.out.println(false || true);// 0 || 1 -> 1
        System.out.println(false || false);//0 || 0 -> 0

    }
}
