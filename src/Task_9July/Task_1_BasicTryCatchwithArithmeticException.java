package Task_9July;
/*
Task 1: Basic Try-Catch with ArithmeticException
📘 Description:
Divide a number by zero and handle the exception.
🧤 Expected Output:
Catch ArithmeticException and print a friendly message
 */
public class Task_1_BasicTryCatchwithArithmeticException {
    public static void main(String[] args)
    {
        int number = 10;
        int result;

        try
        {
            result = number / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }

    }
}
