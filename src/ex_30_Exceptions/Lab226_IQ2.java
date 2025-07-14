package ex_30_Exceptions;

public class Lab226_IQ2 {
    public static void main(String[] args) {
        int c = 0;
        try {
           int b = 10/c; // Vulnerable Code should be written inside try and catch block
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
