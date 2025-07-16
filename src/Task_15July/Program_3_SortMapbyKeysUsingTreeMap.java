package Task_15July;
/*
3. Program: Sort Map by Keys Using TreeMap
Description:
Store data in HashMap, then transfer to TreeMap to sort by keys.
Input: {"Ravi": 80, "Anjali": 95, "Dipak": 75}
Output:
Anjali = 95
Dipak = 75
Ravi = 80
 */
import java.util.*;

public class Program_3_SortMapbyKeysUsingTreeMap {
    public static void main(String[] args)
    {
        // Step 1: Create and populate the HashMap
        HashMap<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Ravi", 80);
        marksMap.put("Anjali", 95);
        marksMap.put("Dipak", 75);

        // Step 2: Transfer data to TreeMap to sort by keys
        TreeMap<String, Integer> sortedMap = new TreeMap<>(marksMap);

        // Step 3: Print the sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet())
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
