
import java.util.Scanner;
public class passwordValidation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a password to validate: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("password is valid");   
        } else {
            System.out.println("The password is invalid. It must be at least 8 characters long and contain both letters and numbers.");
        }
        scanner.close();
    }
    public static boolean isValidPassword(String password){
        if (password.length() < 8){
            return false;
        }
        boolean hasLetter = false;
        boolean hasNumer = false;
        
        for (char ch : password.toCharArray()){
            if (Character.isLetter(ch)){
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasNumer =true;
                
            } if (hasLetter && hasNumer) {
                return true;
            }
        }
        return false;
    }
}
