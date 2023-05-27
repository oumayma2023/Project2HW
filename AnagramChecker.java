package Project2HW;

import java.util.Arrays;

public class AnagramChecker {
        public static boolean areAnagrams(String str1, String str2) {
            // Remove any non-alphanumeric characters and convert both strings to lowercase
            String cleanedStr1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String cleanedStr2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // If the cleaned strings have different lengths, they can't be anagrams
            if (cleanedStr1.length() != cleanedStr2.length()) {
                return false;
            }

            // Convert the cleaned strings to character arrays
            char[] charArray1 = cleanedStr1.toCharArray();
            char[] charArray2 = cleanedStr2.toCharArray();

            // Sort the character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted character arrays
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";
            boolean areAnagrams = areAnagrams(str1, str2);
            System.out.println(areAnagrams);
        }
    }

