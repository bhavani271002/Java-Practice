import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Edge case: If there are less than 2 elements, exit
        if (n < 2) {
            System.out.println("Array must contain at least 2 elements!");
            return;
        }

        // Step 2: Read the array elements
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 3: Find the second largest element
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                // Update second largest before changing largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update second largest if it's smaller than the largest
                secondLargest = num;
            }
        }

        // Step 4: Display the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be the same).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        scanner.close();
    }
}