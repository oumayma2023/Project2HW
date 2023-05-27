package Project2HW;

public class Reverse {


    public class StringReverser {
        public static String reverseString(String input) {
            // Convert the string to a character array
            char[] charArray = input.toCharArray();

            // Initialize two pointers, one at the start and another at the end of the array
            int start = 0;
            int end = charArray.length - 1;

            // Swap characters from both ends until the pointers meet in the middle
            while (start < end) {
                // Swap characters
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;

                // Move the pointers towards the middle
                start++;
                end--;
            }

            // Convert the character array back to a string and return it
            return new String(charArray);
        }

        public static void main(String[] args) {
            String input = "Hello";
            String reversed = reverseString(input);
            System.out.println(reversed);
        }
    }
}
