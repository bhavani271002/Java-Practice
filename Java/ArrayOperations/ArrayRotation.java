import java.util.Scanner;

public class ArrayRotation {
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

        // Step 3: Read number of positions to rotate
        System.out.print("Enter the number of positions to rotate: ");
        int n = scanner.nextInt();
        n = n % size; // Handle cases where n > size

        // Step 4: Rotate the array
        rotateArray(array, n);

        // Step 5: Display the rotated array
        System.out.println("Rotated array:");
        printArray(array);

        scanner.close();
    }

    // Function to rotate the array by 'n' positions using reversal algorithm
    public static void rotateArray(int[] arr, int n) {
        if (n == 0) return;

        // Reverse first 'n' elements
        reverse(arr, 0, n - 1);

        // Reverse remaining elements
        reverse(arr, n, arr.length - 1);

        // Reverse entire array
        reverse(arr, 0, arr.length - 1);
    }

    // Helper function to reverse part of an array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}