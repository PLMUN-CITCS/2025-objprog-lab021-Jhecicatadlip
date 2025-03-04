import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close(); // Close scanner to prevent resource leak
        return sentence;
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 if sentence is empty or null
        }
        return sentence.trim().split("\\s+").length; // Split by spaces and count words
    }

    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get user input
        int wordCount = countWords(sentence); // Count words
        System.out.println("Word count: " + wordCount); // Display result
    }
}