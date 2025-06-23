package ex_15_Strings;

public class Lab142_String_Interview_Ex3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello"; // SCP -> 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //  OA = 3

        // == -> This checks the locations ref of two strings.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s4); //true
        System.out.println(s2 == s3);
        System.out.println(s2 == s5);
        System.out.println(s2 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s4);
        System.out.println(s5 == s4);

        // equals --> Check the content of two strings -> value
        System.out.println("--------------");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s5)); //false
        System.out.println(s3.equalsIgnoreCase(s5));
    }

}
