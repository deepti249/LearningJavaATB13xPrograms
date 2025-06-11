package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        boolean b = false;
        System.out.println(!!b);

        boolean c = a || b;  // true || false  //1 or gate 0 -> 1
        System.out.println(c);

        boolean d = a && b; //true && false  //1 and gate 0 -> 0
        System.out.println(d);
    }
}
