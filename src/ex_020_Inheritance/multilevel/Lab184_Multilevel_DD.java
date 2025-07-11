package ex_020_Inheritance.multilevel;

public class Lab184_Multilevel_DD {
    public static void main(String[] args) {

        // Son s1 = new Father();
        //  Son s1 = new GrandFather();

        Son amit = new Son();
        amit.gf();
        amit.f();
        amit.s();
        amit.home(); //home function of Son is getting called as we have created object of Son.

        System.out.println("----------------------");

        GrandFather grandFather = new Son();
        grandFather.gf();
        grandFather.home(); //home function of Son is getting called as we have created object of Son.
         //Can only access GrandFather class methods and
        // can't access Father or Son class methods in Dynamic dispatch here.
    }
}
