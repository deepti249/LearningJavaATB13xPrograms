package ex_15_Strings;

public class Lab141_String_Interview_Ex2 {
    public static void main(String[] args) {
        String s1 = "Hello"; //SCP
        String s4 = "Hello"; //SCP
        String s10 = "Hello";//SCP

        String s2 = new String("Hello");//OA
        String s3 = new String("Hello");//OA
        String s5 = new String("hello");//OA

        // SCP | OA
        //String s1,s4 and s10 all will point to only one string named as "Hello" in SCP.
        //Whereas String s2,s3,s5 will point to 3 different strings in Object area.
        //So, total area -> SCP 1 and OA 3 -> 4
    }
}
