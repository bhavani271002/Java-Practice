package StringOperations;
import java.util.Scanner;
public class vowelsConsonantsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        int vowelsCount = 0;
        int consonantsCounnt = 0;
        input=input.toLowerCase();
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (Character.isLetter(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCounnt++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCounnt);
        scanner.close();
    }    
}
