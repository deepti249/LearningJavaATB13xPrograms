package Task_4July;

//Program 4: Create a Program to Access the private access modifier

public class Program_4_PrivateAccessModifier {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Deepti Lodha");
        System.out.println("Name: " + person.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}