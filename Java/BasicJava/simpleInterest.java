import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.println("enter Interest amount in %: ");
        double Interest = scanner.nextDouble();
        System.out.println("enter period in years: ");
        double period = scanner.nextDouble();

        double sum = principal * Interest * period / 100;

        System.out.println("here is the your Simple interest: " + sum);

        scanner.close();
    }
    
}
