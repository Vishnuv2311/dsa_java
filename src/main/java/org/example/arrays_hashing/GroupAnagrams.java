package org.example.arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate through the array of strings
        for (String str : strs) {
            // Convert the string to a char array, sort it, and convert it back to a string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Check if the sorted string is already in the map
            if (!anagramMap.containsKey(sortedStr)) {
                // If not, create a new list for this anagram
                anagramMap.put(sortedStr, new ArrayList<>());
            }

            // Add the original string to the list of its anagram
            anagramMap.get(sortedStr).add(str);
        }

        // Convert the values of the map to a list to get the final result
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result1 = groupAnagrams(strs1);
        System.out.println(result1);
        // Output: [[bat], [nat, tan], [ate, eat, tea]]

        String[] strs2 = {""};
        List<List<String>> result2 = groupAnagrams(strs2);
        System.out.println(result2);
        // Output: [[]]

        String[] strs3 = {"a"};
        List<List<String>> result3 = groupAnagrams(strs3);
        System.out.println(result3);
        // Output: [[a]]
    }
}
