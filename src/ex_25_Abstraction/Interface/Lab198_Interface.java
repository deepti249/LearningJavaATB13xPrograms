package ex_25_Abstraction.Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10,10);
    }
}

class Rectangle implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}


interface Polygon {

//No need to write abstract for abstract methods in interface
   void getArea(int length, int breadth);


    //Interface cannot have complete or concrete methods like abstract class.
    //They can have complete or concrete methods either by using default or static keyword.
    /*
        void complete(){
   }
   */

    default void complete() {
        System.out.println("Default methods are allowed in interface!");
    }

    default void complete2() {
        System.out.println("Multiple default methods are allowed in interface!");
    }

    static void staticComplete() {
        System.out.println("Static methods are allowed in interface!");
    }

}


//We need to write abstract for abstract methods in abstract class.
//abstract class can have multiple complete or concrete methods.

abstract class A {
    abstract void m1();

    void complete() {
        System.out.println("complete!");
    }

    void complete1() {
        System.out.println("complete 1!");
    }
}