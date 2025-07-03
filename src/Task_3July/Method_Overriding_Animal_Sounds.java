package Task_3July;

public class Method_Overriding_Animal_Sounds {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Cow cow = new Cow();
        cow.sound();

    }
}

class Animal
{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog -> Bark");
    }
}
class Cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Cat - >Meow");
    }
}

class Cow extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Cow -> Moo");
    }
}