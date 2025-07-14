package ex_29_Wrapper_Class;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // This is called AutoBoxing -> Primitive to Wrapper
        // JVM will automatically convert primitive datatype to its respective Wrapper and store the value

        System.out.println(b.intValue()); //Method

        //  Wrapper to Primitive -> Un Boxing
        // Unboxing -> wrapper is removed, attribute, behaviour is lost.

        Integer c = 42;
        int d = c;
        System.out.println(d);
    }
}