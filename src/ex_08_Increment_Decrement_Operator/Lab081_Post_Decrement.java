package ex_08_Increment_Decrement_Operator;

public class Lab081_Post_Decrement {
    public static void main(String[] args) {
        //Post decrement will assign the value first and then decrement it
        int a = 10;
        int result = a--;
        System.out.println(result); // 10
        System.out.println(a); //9
    }
}
