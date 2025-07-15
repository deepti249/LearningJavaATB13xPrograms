package Task_9July;
/*
✅ Task 8: Throw Exception and Catch It
📘 Description:
Manually throw an exception using throw new ArithmeticException() and catch it.
 */

public class Task_8_ThrowExceptionandCatchIt {
    public static void main(String[] args)
    {

        try
        {
            // Manually throwing an exception
            throw new ArithmeticException("Manual arithmetic exception thrown!");
        } catch (ArithmeticException e)
        {
            System.out.println("Caught manually thrown exception: " + e.getMessage());
        }

        System.out.println("Program continues after manual throw and catch.");
    }
}
