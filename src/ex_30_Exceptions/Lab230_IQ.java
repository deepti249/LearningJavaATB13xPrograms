package ex_30_Exceptions;

public class Lab230_IQ {
    public static void main(String[] args) {
        int a= 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("Divide by Zero Exception");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }
    }
}
