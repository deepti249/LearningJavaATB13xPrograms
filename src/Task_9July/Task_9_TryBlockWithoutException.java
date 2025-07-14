package Task_9July;
/*
✅ Task 9: Try Block Without Exception
📘 Description:
Write a try block that does not throw any exception.
Verify that the catch block is skipped and finally still runs.
 */
public class Task_9_TryBlockWithoutException {
    public static void main(String[] args)
    {
        try
        {
            // This code does NOT throw any exception
            int a = 20, b = 4;
            int result = a / b;
            System.out.println("Try block executed successfully. Result = " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("This catch block will be skipped since no exception is thrown.");
        } finally
        {
            System.out.println("Finally block executed: Always runs.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
