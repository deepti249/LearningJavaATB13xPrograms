package ex_15_Strings;

public class Lab138_String_Concate_Immutable {

    public static void main(String[] args) {
        String s1 = "hello";
        s1.concat("world");
        // Concat, basically add the value or merge the value in the end.
        System.out.println(s1); //here the string is immutable so it will print hello only

        String s2 ="world";
        String result = s1.concat(s2);
        System.out.println(result);
    }
}
