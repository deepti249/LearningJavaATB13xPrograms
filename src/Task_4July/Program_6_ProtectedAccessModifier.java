package Task_4July;

/*
Program 6: Demonstrate protected Access Modifier
:-  Learn how protected members behave in inheritance.
📝 Instructions:
Create a class Animal with a protected method eat() that prints "Animal is eating".
Create a child class Dog that extends Animal.
Create a method doEat() in Dog class which calls eat() using inheritance.
In main(), create a Dog object and call doEat().
 */

public class Program_6_ProtectedAccessModifier {
    public static void main(String[] args)
    {
        Dog_2 d2 = new Dog_2();
        d2.doEat();

    }
}

class Animal_2
{
    protected void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog_2 extends Animal_2
{
    void doEat()
    {
        super.eat();
    }
}
