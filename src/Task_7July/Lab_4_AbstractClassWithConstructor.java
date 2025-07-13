package Task_7July;
/*
4. Abstract Class with Constructor
Description: Show that abstract class can have constructor. Print message from constructor and method.
🔶Expected Output:
Abstract class constructor called
Method from abstract class
 */
public class Lab_4_AbstractClassWithConstructor {
    public static void main(String[] args)
    {
        ConcreteClass obj = new ConcreteClass();
        obj.display();
    }
}

// Abstract class with constructor
abstract class AbstractExample
{
    // Constructor
    AbstractExample()
    {
        System.out.println("Abstract class Constructor is called");
    }

    // Concrete method
    void display()
    {
        System.out.println("Concrete Method from abstract class is called");
    }
}

// Concrete subclass
class ConcreteClass extends AbstractExample
{
    // No need to define constructor unless needed
}
