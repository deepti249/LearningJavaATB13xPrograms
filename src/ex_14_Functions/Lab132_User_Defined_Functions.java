package ex_14_Functions;

public class Lab132_User_Defined_Functions {
    public static void main(String[] args) {
    int result = sum_of_number(3,4);
    System.out.println(result);

    sum_of_number_no_return(3,5);
    }

    static int sum_of_number(int a, int b) {
        return a + b;
    }

    static void sum_of_number_no_return(int a, int b) {
        System.out.println(a + b);
    }
}
