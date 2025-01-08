package StringOperations;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Create a HashMap to store character frequency
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Step 3: Count character frequency
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 4: Display character frequencies
        System.out.println("Character Frequencies:");
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        scanner.close();
    }
}