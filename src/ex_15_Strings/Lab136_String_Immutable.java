package ex_15_Strings;

public class Lab136_String_Immutable {
    public static void main(String[] args) {
        String name = "Pramod"; //SCP
        name.toUpperCase(); //Pramod....It didn't change the original string
        System.out.println(name);

        name = name.toUpperCase();//PRAMOD
        System.out.println(name);

        /*String s1 = "Hello";
        String s2 = s1.concat(" World");
        System.out.println(s1);
        System.out.println(s2);*/
    }
}
