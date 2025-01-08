import java.util.Scanner;
public class votingEligibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Are you a citizen of this country? (yes or no): ");
        String citizenInput = scanner.next().trim().toLowerCase();
        if (age >= 18 && citizenInput.equals("yes")){
            System.out.print("You are eligible to vote.");
        } else {
            System.out.print("You are not eligible to vote.");
        }
        scanner.close();
    }    
}
