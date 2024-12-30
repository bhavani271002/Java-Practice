import java.util.Scanner;

public class triangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x value: ");
        double base = scanner.nextInt();
        System.out.println("enter y value: ");
        double height = scanner.nextInt();
        double area = 0.5 * base * height;
        System.out.println("area of the triangle= " + area);

        scanner.close();
    }
    
}
