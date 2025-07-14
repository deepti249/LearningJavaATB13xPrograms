package ex_30_Exceptions;

public class Lab224_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("NullPointer Exception or Arithmetic Exception");
        }catch (Exception e){
            System.out.println("Yes, we have catch an exception!");
        }
        System.out.println("End");
    }
}
