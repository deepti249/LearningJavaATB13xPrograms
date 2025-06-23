package ex_15_Strings;

public class Lab137_String_Creation {
    public static void main(String[] args) {
        // String 2 ways
        String s1 = "pramod"; // SCP -> String Pool
        String s2 = new String("pramod"); // OA -> Object Area
        System.out.println(s1);
        System.out.println(s2);
    }
}
