import java.util.Scanner;

public class temperatureConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Menu");
        System.out.println("1. Celsius to fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice==1) {
        System.out.println("Enter Temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);   
        }
        else if (choice==2) {
            System.out.println("Enter Temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: "+ celsius);            
        }
        else {
            System.out.println("Invalid choice, please enter 1 or 2");
        }
        scanner.close();
    }
}