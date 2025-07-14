package Task_8July;

/*
Task 4: Convert Integer to int using Unboxing
📘 Description:
Create an Integer object and convert it back to primitive using unboxing.
📤 Expected Output:
Integer object: 20
Unboxed primitive: 20
 */

public class Task_4_ConvertIntegertointusingUnboxing {
    public static void main(String[] args)
    {
        // Create an Integer object
        Integer wrapperObject = 20;
        System.out.println("Integer object: " + wrapperObject);

        // Unboxing: convert Integer to int
        int primitiveValue = wrapperObject;
        System.out.println("Unboxed primitive: " + primitiveValue);
    }
}
