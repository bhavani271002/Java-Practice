import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = scanner.nextInt();
        System.out.println("enter y: ");
        int y = scanner.nextInt();
        int sum = x%y;
        System.out.println("result of remainder is: "+ sum);
        
        scanner.close();
    }
    
}
