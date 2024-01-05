package org.example.arrays_hashing;

import java.util.*;

public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a Priority Queue (Min Heap) to store elements based on their frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );

        // Add elements to the heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            // If the size of the heap exceeds k, remove the element with the smallest frequency
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Create a list to store the result
        List<Integer> result = new ArrayList<>();

        // Extract elements from the heap and add them to the result list
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        // Reverse the list to get elements in descending order of frequency
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        System.out.println(topKFrequent(nums1, k1)); // Output: [1, 2]

        int[] nums2 = {1};
        int k2 = 1;
        System.out.println(topKFrequent(nums2, k2)); // Output: [1]
    }
}
