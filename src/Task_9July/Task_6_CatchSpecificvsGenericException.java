package Task_9July;
/*
✅ Task 6: Catch Specific vs Generic Exception
📘 Description:
Try the same code twice — once using catch(Exception e) and once using catch(NullPointerException e).
Compare output and behavior.
 */
public class Task_6_CatchSpecificvsGenericException {
    public static void main(String[] args)
    {
        System.out.println("First Run: Specific catch (NullPointerException)");
        try {
            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
        } catch (NullPointerException e)
        {
            System.out.println("Caught specifically: " + e);
        }

        System.out.println("\n Second Run: Generic catch (Exception)");
        try {
            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
        } catch (Exception e)
        {
            System.out.println(" Caught generically: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println("\n Program continues after both try-catch blocks.");

    }
}
