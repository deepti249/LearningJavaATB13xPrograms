package ex_21_Polymorphism.Method_OverRiding;

public class Lab189_Method_Overriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound(); //child class method is called
    }
}

class Animal{
    void sound(){
        System.out.println("Default Sound!");
    }

    void A(){
        System.out.println("A -> Animal");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog -> Bark!");
    }

}