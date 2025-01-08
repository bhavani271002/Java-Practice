import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input array elements
        Integer[] array = new Integer[n]; // Using Integer[] for Collections.reverseOrder()
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort in ascending order
        Arrays.sort(array);
        System.out.println("Sorted in Ascending Order: " + Arrays.toString(array));

        // Sort in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + Arrays.toString(array));

        scanner.close();
    }
}