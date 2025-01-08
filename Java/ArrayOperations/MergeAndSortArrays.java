import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read first array
        System.out.print("Enter the size of first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter " + size1 + " elements for the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Step 2: Read second array
        System.out.print("Enter the size of second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter " + size2 + " elements for the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Step 3: Merge the arrays
        int[] mergedArray = new int[size1 + size2];
        System.arraycopy(array1, 0, mergedArray, 0, size1);
        System.arraycopy(array2, 0, mergedArray, size1, size2);

        // Step 4: Sort the merged array
        Arrays.sort(mergedArray);

        // Step 5: Display the sorted merged array
        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}