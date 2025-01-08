import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Step 2: Read array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 3: Remove duplicates using HashSet
        Set<Integer> uniqueSet = new LinkedHashSet<>(); // Maintains order
        for (int num : array) {
            uniqueSet.add(num);
        }

        // Step 4: Convert Set back to an array
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        // Step 5: Display the unique elements
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}