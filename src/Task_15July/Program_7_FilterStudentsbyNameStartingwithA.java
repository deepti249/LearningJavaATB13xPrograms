package Task_15July;
/*
7. Program: Filter Students by Name Starting with 'A'
Description:
Store roll numbers and names in a HashMap, print only those starting with 'A'.
Input: {101="Anjali", 102="Dipak", 103="Aman", 104="Ravi"}
Output:
101 -> Anjali
103 -> Aman
*/
import java.util.*;

public class Program_7_FilterStudentsbyNameStartingwithA {
    public static void main(String[] args)
    {
        // Step 1: Create and populate the HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Anjali");
        studentMap.put(102, "Dipak");
        studentMap.put(103, "Aman");
        studentMap.put(104, "Ravi");

        // Step 2: Filter and print names starting with 'A'
        System.out.println("Students with names starting with 'A':");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet())
        {
            if (entry.getValue().startsWith("A"))
            {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
