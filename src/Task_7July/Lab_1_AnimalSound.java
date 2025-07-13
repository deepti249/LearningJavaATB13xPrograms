package Task_7July;

/*
1. Animal Sound - Abstract Method Implementation
Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
🔶 Expected Output:
Dog barks
Cat meows
 */

public class Lab_1_AnimalSound {
    public static void main(String[] args)
    {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}

abstract class Animal
{
    abstract void makeSound();
}

class Dog extends Animal
{

    @Override
    void makeSound()
    {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal
{

    @Override
    void makeSound()
    {
        System.out.println("Cat meows");
    }
}
