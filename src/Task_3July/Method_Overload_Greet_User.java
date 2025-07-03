package Task_3July;

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