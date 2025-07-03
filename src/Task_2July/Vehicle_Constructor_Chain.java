package Task_2July;

public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {
        Bike bike = new Bike();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}