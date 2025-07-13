package ex_25_Abstraction.Interface;

public class Lab202_Abstraction {
}

abstract class Incomplete_abstract{
    int a= 10;

    Incomplete_abstract(){
        //Abstract class can have a constructor
    }

    abstract void display1();

    void display2(){
        a= 25; //Value of instance variable can be changed
        System.out.println("a");
    }
}

interface Incomplete_Interface{

//    Incomplete_Interface(){
//        Interface can never have a constructor
//    }

    int a = 10; //instance variable in interface is by default final in nature

    void display();

    default void display2(){
        //a = 12;
        System.out.println("Default is allowed!");
    }

    static void display3(){
        System.out.println("Static is allowed!");
    }
}