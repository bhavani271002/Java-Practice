import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare array
        int[] array = new int[n];

        // Input: Read array elements
        System.out.println("Enter " + n + " integers:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i]; // Compute sum while reading input
        }

        // Compute average
        double average = (double) sum / n;

        // Output results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}