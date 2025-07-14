package ex_30_Exceptions;

public class Lab229_Jr_QA {
    public static void main(String[] args) {
        String input = null; // java.lang.ArrayIndexOutOfBoundsException
        try {
            input = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
          int a = Integer.parseInt(input);  // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        int n = 0;
        int p = 0 ;
        try {
           p = 100 / n ;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(p);
    }
}
