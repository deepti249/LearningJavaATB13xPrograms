package ex_29_Wrapper_Class;

public class Lab215_Wrapper_Conversion_String {
    public static void main(String[] args) {

        String num  = "10";

        // String to Wrapper (parseInt or valueOf method)
        Integer a = Integer.parseInt(num);
        System.out.println(a);

        Integer b = Integer.valueOf(num);
        System.out.println(b);

        // String to Primitive (parseInt method)
        int aa = Integer.parseInt(num);
        System.out.println(aa);

        // Wrapper to String (toString method)
        System.out.println(a.toString());

        // Primitive to String (Primitive -> Wrapper -> toString (String))
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString()); // "10"
    }
}
