package ex_29_Wrapper_Class;

public class Lab212_Primitive_Wrapper {
    public static void main(String[] args) {
        int a = 10; // primitive

        // This is not Object. So, it will not have attribute or Behaviour
        // char, short, byte, long, float, double, - we will avoid them now

        // We will use the Wrapper classes instead of Primitive datatype
        // Character, Boolean, Short, Long, Double, Float

        Integer age = 65;//wrapper

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(age);
        System.out.println(age.intValue());


    }

}
