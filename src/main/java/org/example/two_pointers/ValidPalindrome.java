package org.example.two_pointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Use two pointers to check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1)); // Output: true

        String s2 = "race a car";
        System.out.println(isPalindrome(s2)); // Output: false

        String s3 = " ";
        System.out.println(isPalindrome(s3)); // Output: true
    }
}
