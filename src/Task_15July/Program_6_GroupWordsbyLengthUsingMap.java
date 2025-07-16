package Task_15July;
/*
6. Program: Group Words by Length Using Map
Description:
Group words based on their length using Map<Integer, List<String>>.
Input: ["Java", "is", "fun", "cool", "Hi"]
Output:
2 -> [is, Hi]
3 -> [fun]
4 -> [Java, cool]
 */
import java.util.*;

public class Program_6_GroupWordsbyLengthUsingMap {
    public static void main(String[] args)
    {
        // Input list of words
        String[] words = {"Java", "is", "fun", "cool", "Hi"};

        // Map to store length as key and list of words as value
        Map<Integer, List<String>> lengthMap = new HashMap<>();

        // Loop through each word
        for (String word : words)
        {
            int length = word.length();

            // If the length already exists, add the word to the list
            if (!lengthMap.containsKey(length))
            {
                lengthMap.put(length, new ArrayList<>());
            }

            lengthMap.get(length).add(word);
        }

        // Print the grouped words
        for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
