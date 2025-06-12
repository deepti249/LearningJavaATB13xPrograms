package ex_06_Ternary_Operator;

public class Lab062_TO_Age_Vote {
    public static void main(String[] args) {
        int age = 10;
        //check whether a person can vote or not
        String result = age > 18 ? "Can Vote" : "Cannot Vote" ;
        System.out.println(result);

    }
}
