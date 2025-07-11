package ex_020_Inheritance.multilevel;

public class Lab182_Multi_level {
    public static void main(String[] args) {
        GrandFather gf1 = new GrandFather();
        gf1.gf();
        gf1.home(); //GrandFather's home method is called
        System.out.println(" -- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();
        f1.home(); //Father's home method is called since it has overridden GrandFather's home method

        System.out.println(" -- ");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();
        s1.home(); //Son's home method is called since it has overridden Father's home method






    }
}
