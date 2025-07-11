package Task_3July;

/*
Task 4: Greet User
Title: Greet users differently using overloading
Description:
Create a class Greeter with the following methods:
greet() – prints "Hello!"
greet(String name) – prints "Hello, [name]!"
This task teaches overloading based on the number of parameters.
 */

public class Method_Overload_Greet_User {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Deepti");
    }
}

class Greeter
{
    String greet() {
        return "Hello!";
    }

    String greet(String name) {
        System.out.println("Hello, " +name+ " !");
        return name;
    }
}