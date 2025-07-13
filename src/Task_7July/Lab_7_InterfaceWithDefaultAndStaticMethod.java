package Task_7July;
/*
7. Interface with Default and Static Method
🔶 Objective:
Learn how to use default and static methods in interfaces (since Java 8).
🔶 Steps:
Create an interface Vehicle.
Add a default method start() that prints "Vehicle started".
Add a static method fuelType() that prints "Fuel type is Petrol".
Create a class Car that implements Vehicle.
In main(), create a Car object and call start().
Call Vehicle.fuelType() without creating an object.
🔶 Expected Output:
Vehicle started
Fuel type is Petrol
 */

public class Lab_7_InterfaceWithDefaultAndStaticMethod {
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.start();              // Calls default method from interface
        Vehicle.fuelType();         // Calls static method from interface directly
        // because static method can be called without creating an object

    }
}

// Interface with default and static methods
interface Vehicle
{
    // Default method
    default void start()
    {
        System.out.println("Vehicle started");
    }

    // Static method
    static void fuelType()
    {
        System.out.println("Fuel type is Petrol");
    }
}

// Class implementing the interface
class Car implements Vehicle
{
    // No need to override start() unless customization is needed
}