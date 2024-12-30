import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x value: ");
        int x = scanner.nextInt();
        System.out.println("enter y value: ");
        int y = scanner.nextInt();
        int sum = x/y;
        System.out.println("result for division= " + sum);

        scanner.close();
    }
    
}
