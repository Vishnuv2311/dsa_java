package org.example.arrays_hashing;

import java.util.Arrays;


public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        long startTime = System.nanoTime();

        int n = nums.length;

        // Arrays to store the product of elements to the left and right of each element
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Initialize left and right products arrays
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];

        }

        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Calculate the product of elements except self
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");

        return result;
    }

    public static int[] productExceptSelfNaive(int[] nums) {
        long startTime = System.nanoTime();
        int sum[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                    product *= nums[j];
            }
            sum[i] = product;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time Naive: " + duration + " nanoseconds");
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] result1 = productExceptSelf(nums1);
        System.out.println(Arrays.toString(result1)); // Output: [24, 12, 8, 6]
        System.out.println("\n\n\n");
        System.out.println(Arrays.toString(productExceptSelfNaive(nums1)));

/*        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = productExceptSelf(nums2);
        System.out.println(Arrays.toString(result2)); // Output: [0, 0, 9, 0, 0]
*/
    }
}
