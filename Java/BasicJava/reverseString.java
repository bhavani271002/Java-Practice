import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String input = scanner.next();
        StringBuilder sb = new StringBuilder(input);
        String reversedString = sb.reverse().toString();
        System.out.println(reversedString);
        scanner.close();
    }
}
