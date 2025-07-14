package Task_8July;

/*
Task 5: Compare Wrapper objects using == and equals()
📘 Description:
Compare two Integer objects using == and .equals() and print the results.
Expected Output:
a == b: true
c == d: false
a.equals(b): true
c.equals(d): true
 */

public class Task_5_CompareWrapperobjectsusingandequals {
    public static void main(String[] args)
    {
        // Values between -128 and 127 are cached in Integer pool
        Integer a = 100;
        Integer b = 100;

        // Values outside of -128 to 127 are not cached
        Integer c = 200;
        Integer d = 200;

        // Compare using ==
        System.out.println("a == b: " + (a == b));  // true due to caching
        System.out.println("c == d: " + (c == d));  // false (different objects)

        // Compare using equals()
        System.out.println("a.equals(b): " + a.equals(b));  // true
        System.out.println("c.equals(d): " + c.equals(d));  // true

    }
}
