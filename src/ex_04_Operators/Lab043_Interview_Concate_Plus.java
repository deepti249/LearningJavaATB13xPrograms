package ex_04_Operators;

public class Lab043_Interview_Concate_Plus {
    public static void main(String[] args) {

        String firstname = "Deepti";
        String lastname = "Lodha";

        System.out.println(firstname + lastname);

        int a = 10;
        int b = 10;
        System.out.println(firstname + lastname + a + b);
        System.out.println(a + b + firstname + lastname);
        System.out.println(firstname + lastname + (a + b)); // BODMAS - Bracket of Div, mul, add, sub

    }
}
