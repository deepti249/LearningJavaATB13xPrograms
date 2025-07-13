package ex_25_Abstraction.Abstract_Class;

public class Lab195_Abstract_Class_Father {

    public static void main(String[] args) {
        // Father f1 = new Father(); //Object of abstract class cannot be created.

        Child  child = new Child();
        child.loan50K();

        Father  f2 = new Child(); // Dynamic Dispatch is possible
    }
}


abstract class Father{

    // This is called the abstract method/function i.e. method without implementation.
    abstract void loan50K();

    // as a complete function
    void loan25K(){
        System.out.println("Given the 25K");
    }
}

class Child extends Father{

    //Child needs to implement all the abstract methods of Father class
    @Override
    void loan50K() {
        System.out.println("Son has to give the 50k loan");
    }
}