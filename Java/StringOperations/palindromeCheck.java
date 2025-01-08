package StringOperations;
import java.util.Scanner; 
public class palindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        if (cleanedInput.equals(reversed)){
            System.out.print("The string is a palindrome.");
        } else {
            System.out.print("The string is not a palindrome.");
        }
        scanner.close();
    }
}
