package Task_2July;

public class Animal_Sound_Simulator {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
        c.meow();
    }
}

 class Animal {
    void makeSound(){
        System.out.println("Animal -> Parent");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat -> Child");
    }
}