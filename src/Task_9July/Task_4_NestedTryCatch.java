package Task_9July;

/*
✅ Task 4: Nested Try-Catch
📘 Description:
Write a program with a try-catch block inside another try-catch block.
Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException.
 */
public class Task_4_NestedTryCatch {
    public static void main(String[] args)
    {
        try
        {
            // Outer try block - can catch ArithmeticException
            int a = 10, b = 0;
            int result = a / b; // This line will throw ArithmeticException
            try
            {
                // Inner try block - can catch ArrayIndexOutOfBoundsException
                int[] numbers = {1, 2, 3};
                System.out.println("Accessing 5th element: " + numbers[4]); // Throws ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(" Inner catch: Array index is out of bounds.");
            }

        } catch (ArithmeticException e)
        {
            System.out.println("Outer catch: Cannot divide by zero.");
        }
        System.out.println("Program continues after nested try-catch blocks.");
    }
}
