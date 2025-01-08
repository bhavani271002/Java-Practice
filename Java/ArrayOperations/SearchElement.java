import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Step 2: Declare and read the array
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 3: Input the element to search for
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Step 4: Perform Linear Search
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                position = i; // Store index if found
                break; // Stop searching once found
            }
        }

        // Step 5: Display the result
        if (position == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at position (index): " + position);
        }

        scanner.close();
    }
}