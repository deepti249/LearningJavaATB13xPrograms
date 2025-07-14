package Task_9July;
/*
✅ Task 10: Try With Multiple Statements
📘 Description:
Write multiple statements in a try block.
Ensure if the first fails, the rest are not executed, and control goes to catch.
 */

public class Task_10_TryWithMultipleStatements {
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Statement 1: About to divide by zero");
            int result = 10 / 0;  // This will throw ArithmeticException

            System.out.println("Statement 2: This will not be executed");
            String str = null;
            System.out.println("Length: " + str.length());

            System.out.println("Statement 3: Also won't be executed");

        } catch (ArithmeticException e)
        {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("Program continues after try-catch.");
    }
}
