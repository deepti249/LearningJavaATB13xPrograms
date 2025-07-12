package Task_4July;

//Program 1: Access parent class constructor using super()

public class Program_1_Constructor_Super {
    public static void main(String[] args) {
        Car car = new Car();
    }
}

class Vehicle {

    //DC
    Vehicle() {
        System.out.println("Vehicle -> Parent");
    }
}

class Car extends Vehicle
{
    Car()
    {
        super();
    }
}