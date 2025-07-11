package Task_3July;
/*
Task 1: Animal Sounds
Title: Override sound behavior in subclasses
Description:
Create a base class Animal with a method sound().
Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
Create an object of each class and call sound() to see how overriding provides different outputs using the
same method name.
 */
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

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog -> Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat - >Meow");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow -> Moo");
    }
}