package ex_18_OOPS_Class_Object;

public class Person {
    // These are called properties, attributes, instance variables, member variables.
    String name;
    int age;
    int height;
    String gender;
    boolean is_married;


    // These are called as Behaviours, Member Functions, Functions, Methods.
    void walk(){
        System.out.println("Walking");
    }

    void eat(String food){
        System.out.println("Eating food");
    }

    String sleep(){
        System.out.println("Walking");
        return null;
    }

    String food(int a){
        System.out.println("Food");
        return null;
    }

    //We can create all 4 types of functions
}
