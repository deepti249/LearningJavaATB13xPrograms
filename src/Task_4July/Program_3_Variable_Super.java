package Task_4July;

//Program 3: Access parent class variable using super

public class Program_3_Variable_Super {
        public static void main(String[] args) {
            Dog_1 d = new Dog_1();
            d.displayNames();
        }
    }

    class Animal_1 {
        String name = "Animal";
    }

    class Dog_1 extends Animal_1 {
        String name = "Dog";

        void displayNames() {
            System.out.println("Child class name: " + name);
            System.out.println("Parent class name: " + super.name);
        }
    }
