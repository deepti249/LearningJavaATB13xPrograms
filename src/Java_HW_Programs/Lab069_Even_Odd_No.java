package Java_HW_Programs;

public class Lab069_Even_Odd_No {
    public static void main(String[] args) {
        int a = 19;
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("A = " + a + " is " + result);

        a = 20;
        result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("A = " + a + " is " + result);

    }
}
