package Project2HW;

public class countNumberOfWords {



        public static int countWords(String input) {
            // Remove leading and trailing whitespace
            input = input.trim();

            // If the input is empty, return 0
            if (input.isEmpty()) {
                return 0;
            }

            // Split the input string into words using whitespace or punctuation as separators
            String[] words = input.split("\\s+|\\p{Punct}");

            // Count the number of non-empty words
            int wordCount = 0;
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount++;
                }
            }

            return wordCount;
        }

        public static void main(String[] args) {
            String input = "Hello, world!";
            int wordCount = countWords(input);
            System.out.println(wordCount);
        }
    }



