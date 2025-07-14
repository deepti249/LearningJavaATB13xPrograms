package Task_8July;
/*
Task 2: Converting String to Primitive Using Wrapper
📘 Description:
Use Integer.parseInt() to convert a string (e.g. "123") into a primitive int and print it.
📤 Expected Output:
Parsed number: 123
 */

public class Task_2_ConvertingStringtoPrimitiveUsingWrapper {
    public static void main(String[] args)
    {
        // String containing a number
        String numberStr = "123";

        // Convert string to int using Integer.parseInt()
        int number = Integer.parseInt(numberStr);

        // Print the result
        System.out.println("Parsed number: " + number);

    }
}
