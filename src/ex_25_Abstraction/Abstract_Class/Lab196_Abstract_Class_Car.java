package ex_25_Abstraction.Abstract_Class;

public class Lab196_Abstract_Class_Car {

    public static void main(String[] args) {
        WagonR car  = new WagonR();
        car.drive();

        // Engine e1 = new Engine();
    }

}


class Car{
    // This is concreate class.... It will not have abstract or incomplete methods
    void done(){

    }
}

abstract class Engine {

    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine() {
        System.out.println("Everything is Good!");
    }
}

class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting the car!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the car!");
    }

    void drive(){
        checkEngine();
        startEngine();
        stopEngine();
    }


}