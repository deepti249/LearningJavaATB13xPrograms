package Task_11July;
/*
5. Compare ArrayList vs LinkedList Performance
📘 Description (Updated with Hints):
In this program, you’ll compare how fast Java can add elements to an ArrayList versus a LinkedList.
You will:
Create two separate lists: one ArrayList and one LinkedList.
Add 100,000 numbers (from 0 to 99,999) to each list using a loop.
Use System.currentTimeMillis() to measure how much time it takes to add the elements.
Print the time taken for both lists.
Hint :-
 :-  System.currentTimeMillis() gives you the current time in milliseconds.
 :-  Subtract the end time from the start time to get the duration.
 :-  You don’t need to print all the 100,000 numbers, just print the time taken.
✅ Expected Output:
ArrayList time: 8 ms
LinkedList time: 12 ms
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_5_CompareArrayListvsLinkedListPerformance {
    public static void main(String[] args)
    {
        // ArrayList performance test
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startArrayList = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endArrayList = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (endArrayList - startArrayList) + " ms");

        // LinkedList performance test
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startLinkedList = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long endLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (endLinkedList - startLinkedList) + " ms");

    }
}
