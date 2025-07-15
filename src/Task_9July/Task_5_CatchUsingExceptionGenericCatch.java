package Task_9July;
/*
✅ Task 5: Catch Using Exception (Generic Catch)
📘 Description:
Use only catch(Exception e) to catch any exception.
Throw a NullPointerException or ArithmeticException inside try.
 */
public class Task_5_CatchUsingExceptionGenericCatch {
    public static void main(String[] args)
    {
        try
        {
            // Uncomment one of the lines below to test different exceptions:

            // 1. ArithmeticException
            //int result = 10 / 0;

            // 2. NullPointerException
             String str = null;
             System.out.println(str.length());

        } catch (Exception e)
        {
            System.out.println("Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        System.out.println("Program continues after generic catch.");
    }
}
