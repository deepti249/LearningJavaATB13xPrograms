package ex_020_Inheritance.hirerchial;

public class Lab185_Hierarchical {
    public static void main(String[] args) {
        Father f = new Father();
        f.home();

        System.out.println("----------------------");

        Pramod p = new Pramod();
        p.P1();
        p.home();

        System.out.println("----------------------");

        Lucky l = new Lucky();
        l.l1();
        l.home();

        System.out.println("----------------------");

        Ruhani r = new Ruhani();
        r.r1();
        r.home();
    }
}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Pramod extends Father{
    void P1(){
        System.out.println("Pramod");
    }
}

class Lucky extends Father{

    void l1(){
        System.out.println("Lucky");
    }
}

class Ruhani extends Father {
    void r1(){
        System.out.println("ruhani");
    }
}