package Task_8July;
/*
Task 1: Autoboxing and Unboxing
📘 Description:
Demonstrate automatic conversion from int to Integer (Autoboxing) and back from Integer to int (Unboxing).
📤 Expected Output:
Primitive: 50
Wrapper: 50
Unboxed again: 50
 */

public class Task_1_AutoboxingandUnboxing {
    public static void main(String[] args) {
        // Primitive int
        int primitive = 50;
        System.out.println("Primitive: " + primitive);

        // Autoboxing: int to Integer
        Integer wrapper = primitive;
        System.out.println("Wrapper: " + wrapper);

        // Unboxing: Integer to int
        int unboxed = wrapper;
        System.out.println("Unboxed again: " + unboxed);
    }
}
