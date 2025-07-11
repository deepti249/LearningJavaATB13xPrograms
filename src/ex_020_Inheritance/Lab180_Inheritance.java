package ex_020_Inheritance;

public class Lab180_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold_f); //superclass variable
        s1.bhk2(); //superclass method
        s1.bhk3();
    }
}

class Father{
    int gold_f  = 1000; // Attribute | Data variables |  Property | Instance Variables

    void bhk2() { //  Behaviour |  Method | Function | Data members
        System.out.println("Father - 2BHK");
    }

}

class Son extends Father{

    //We can inherit using extends keyword.
    // It means simply copying all the public variables and public methods from superclass
    // to subclass

//    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables
//
//    void bhk2() { //  Behaviour |  Method | Function | Data members
//        System.out.println("Father - 2BHK");
//    }

    void bhk3() {
        System.out.println("Son - 3BHK");
    }

}