package ex_25_Abstraction.Interface;

public class Lab199_Interface_Practical {
    public static void main(String[] args) {
        Car1 tesla = new Car1();
        tesla.drive();
    }

}

interface Brakes {
    void applyBreak();
}

interface Engine1 {
    void startEngine();

    void stopEngine();

    default void complete() {
        System.out.println("Default complete function!");
    }

}

//Multiple inheritance is possible in java using Interfaces
class Car1 implements Engine1,Brakes{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

}
