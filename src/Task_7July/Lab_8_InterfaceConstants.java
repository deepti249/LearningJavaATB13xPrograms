package Task_7July;
/*
8. Interface Constants
🔶 Objective:
Demonstrate how to use constants (public static final variables) in interfaces.
🔶 Steps:
Create an interface SpeedLimit with a constant MAX_SPEED = 120.
In a class Car, access and print the constant.
Do not modify the constant—it should behave like a final value.
🔶 Expected Output:
Max Speed is: 120
 */

public class Lab_8_InterfaceConstants {
    public static void main(String[] args)
    {
        Car1 car1 = new Car1();
        car1.showSpeedLimit();
    }
}

// Interface with a constant
interface SpeedLimit
{
    int MAX_SPEED = 120; // implicitly public, static, and final
}

// Class accessing the interface constant
class Car1 implements SpeedLimit
{
    void showSpeedLimit()
    {
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}