package Task_15July;
/*
1. Program: Word Frequency Counter Using HashMap
📘 Description:
Takes a sentence and prints how many times each word appears using HashMap.
Input: "java is easy and java is powerful"
Output:
java -> 2
is -> 2
easy -> 1
and -> 1
powerful -> 1
 */

import java.util.*;

public class Program_1_WordFrequencyCounterUsingHashMap {
    public static void main(String[] args)
    {
        // Input sentence
        String input = "java is easy and java is powerful";

        // Convert the sentence into an array of words
        String[] words = input.split(" ");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words)
        {
            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word))
            {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else
            {
                // Otherwise, add the word with count 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word frequencies
        for (String word : wordCountMap.keySet())
        {
            System.out.println(word + " -> " + wordCountMap.get(word));
        }
    }
}
