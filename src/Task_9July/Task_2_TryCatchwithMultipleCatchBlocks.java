package Task_9July;
/*
✅ Task 2: Try-Catch with Multiple Catch Blocks
📘 Description:
Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException and handle them
with multiple catch blocks.
🧤 Expected Output:
Print which exception occurred
 */
public class Task_2_TryCatchwithMultipleCatchBlocks {
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30};
        int result = 0;

        try {
            // Change these lines to test different exceptions:
            result = numbers[5] / 0;  // May cause ArrayIndexOutOfBoundsException and ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurred: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurred: Invalid array index.");
        }
    }
}
