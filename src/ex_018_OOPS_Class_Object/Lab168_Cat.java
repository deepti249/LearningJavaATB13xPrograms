package ex_018_OOPS_Class_Object;

public class Lab168_Cat {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        //Here Cat -> Class, c1-> object reference and new Cat()-> object creation
        c1.running();

        Cat c2; //This doesn't create object, so, we cant call methods or attribute of Cat class here
       // c2.running();

        new Cat(); //This creates a new object.
        new Cat().running(); //Can call method since object is created with new operator.
    }

}


class Cat {
    String name; // null

    void running() {
        System.out.println("Running");
    }

}