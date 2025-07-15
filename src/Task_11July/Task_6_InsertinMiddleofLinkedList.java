package Task_11July;
/*
6. Insert in Middle of LinkedList
📘 Description:
Create a LinkedList with fruits: Apple, Banana, Mango.
Insert Orange at index 1 and print the final list.
✅ Expected Output:
Fruits List: [Apple, Orange, Banana, Mango]
 */

import java.util.LinkedList;

public class Task_6_InsertinMiddleofLinkedList {
    public static void main(String[] args)
    {
        // Create LinkedList with initial fruits
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits List: " + fruits);

        // Insert "Orange" at index 1
        fruits.add(1, "Orange");

        // Print the final list
        System.out.println("Fruits List: " + fruits);
    }
}
