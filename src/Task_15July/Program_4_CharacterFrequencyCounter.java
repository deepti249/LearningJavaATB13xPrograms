package Task_15July;
/*
4. Program: Character Frequency Counter
Description:
Count how many times each character appears in a string using HashMap.
Input:"aabbccddeeff"
Output:
a -> 2
b -> 2
c -> 2
d -> 2
e -> 2
f -> 2
*/

import java.util.*;

public class Program_4_CharacterFrequencyCounter {
    public static void main(String[] args)
    {
        // Input string
        String input = "aabbccddeeff";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character
        for (char ch : input.toCharArray())
        {
            if (charCountMap.containsKey(ch))
            {
                // Increment count if already present
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else
            {
                // Add new character with count 1
                charCountMap.put(ch, 1);
            }
        }

        // Print the character frequencies
        for (char ch : charCountMap.keySet())
        {
            System.out.println(ch + " -> " + charCountMap.get(ch));
        }
    }
}
