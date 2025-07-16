package Task_15July;
/*
5. Program: Find First Non-Repeated Character
Description:
Prints the first character that appears only once using LinkedHashMap.
Input:→"aabbccdeeff"
Output:→ First non-repeated character is: d
 */

import java.util.*;

public class Program_5_FindFirstNonRepeatedCharacter {
    public static void main(String[] args)
    {
        // Input string
        String input = "aabbccdeeff";

        // Create LinkedHashMap to preserve order
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Step 1: Count frequency of each character
        for (char ch : input.toCharArray())
        {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first character with frequency 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character is: " + entry.getKey());
                return;
            }
        }

        // If no unique character found
        System.out.println("No non-repeated character found.");
    }
}
