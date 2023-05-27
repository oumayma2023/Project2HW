package Project2HW;

public class Palindrome {

    public class PalindromeChecker {
        public static boolean isPalindrome(String input) {
            // Remove any non-alphanumeric characters and convert the string to lowercase
            String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Initialize two pointers, one at the start and another at the end of the cleaned string
            int start = 0;
            int end = cleanedInput.length() - 1;

            // Compare characters from both ends until the pointers meet in the middle
            while (start < end) {
                // If the characters at the current positions are not equal, it's not a palindrome
                if (cleanedInput.charAt(start) != cleanedInput.charAt(end)) {
                    return false;
                }

                // Move the pointers towards the middle
                start++;
                end--;
            }

            // If the loop completes without finding any mismatch, it's a palindrome
            return true;
        }

        public static void main(String[] args) {
            String input = "madam";
            boolean isPalindrome = isPalindrome(input);
            System.out.println(isPalindrome);
        }
    }
}
