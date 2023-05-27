package Project2HW;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public class NonRepeatingCharacterFinder {
        public static char findFirstNonRepeatingChar(String input) {
            // Create a HashMap to store the frequency of each character in the string
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Iterate over each character in the string and update its frequency in the map
            for (char c : input.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Iterate over the string again and return the first character with a frequency of 1
            for (char c : input.toCharArray()) {
                if (charCountMap.get(c) == 1) {
                    return c;
                }
            }

            // If no non-repeating character is found, return a default character or throw an exception
            // based on the requirements of your application
            return '\0'; // Return null character ('\0') as a default value
        }

        public static void main(String[] args) {
            String input = "abracadabra";
            char firstNonRepeatingChar = findFirstNonRepeatingChar(input);
            System.out.println(firstNonRepeatingChar);
        }
    }
}
