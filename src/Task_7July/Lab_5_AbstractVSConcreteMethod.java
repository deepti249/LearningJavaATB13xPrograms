package Task_7July;
/*
5. Abstract vs Concrete Method
🔶 Objective:
Understand how abstract classes can contain both abstract methods (which must be implemented in the subclass)
and concrete methods (which can be used as it is).
🔶 Steps to Create:
Create an abstract class Parent.
Define one abstract method void show().
Define one concrete method void display() that prints a message.
Create a class Child that extends Parent.
Implement the show() method inside Child.
In the main() method, create an object of Child and call both display() and show().
🔶Expected Output:
Concrete method in abstract class
Abstract method implemented
 */

public class Lab_5_AbstractVSConcreteMethod {
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.display(); // Calling concrete method
        obj.show();    // Calling implemented abstract method
    }
}

// Abstract class
abstract class Parent
{
    // Abstract method (no body)
    abstract void show();

    // Concrete method (has body)
    void display()
    {
        System.out.println("Concrete method in abstract class");
    }
}

// Concrete subclass
class Child extends Parent{
    // Implementing the abstract method
    @Override
    void show() {
        System.out.println("Abstract method implemented by Child class");
    }
}
