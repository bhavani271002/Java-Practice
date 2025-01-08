package StringOperations;
import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Reverse the order of the words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        // Trim the trailing space and display the result
        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());

        scanner.close(); // Close the scanner
    }
}