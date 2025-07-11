package ex_020_Inheritance.multilevel;

public class Lab183_Multi_level_DD {
    public static void main(String[] args) {
        Son amit = new Son();

        // Son s1 = new Father(); //Not possible
        // Son s1 = new GrandFather(); //Not possible

        //Dynamic Dispatch -> If we have same method in Super class and Sub class
        // then common method of the class whose object is created will be called.

        GrandFather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();  //home function of Son is getting called as we have created object of Son.

        System.out.println(" -- ");

        GrandFather g2 = new Father(); // Dynamic Dispatch
        g2.gf();
        g2.home(); //home function of Father is getting called

        System.out.println(" -- ");

        Father f2 = new Son(); // Dynamic Dispatch
        f2.f();
        f2.home(); //home function of Son is getting called

        System.out.println(" -- ");


        // Father f3 = new GrandFather(); //Not possible


    }
}
