package Task_8July;

/*
Task 3: Convert int to Integer using Autoboxing
📘 Description:
Declare an int, assign a value, and convert it to Integer using autoboxing.
📤 Expected Output:
Primitive value: 10
Wrapper object: 10
 */

public class Task_3_ConvertinttoIntegerusingAutoboxing {
    public static void main(String[] args)
    {
        // Declare a primitive int
        int primitiveValue = 10;
        System.out.println("Primitive value: " + primitiveValue);

        // Autoboxing: convert int to Integer
        Integer wrapperObject = primitiveValue;
        System.out.println("Wrapper object: " + wrapperObject);
    }
}
