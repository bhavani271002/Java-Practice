import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Step 2: Declare matrices
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        // Step 3: Read Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Read Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Step 5: Perform Matrix Addition (C[i][j] = A[i][j] + B[i][j])
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Step 6: Display the Result
        System.out.println("Matrix A:");
        printMatrix(matrixA, rows, cols);

        System.out.println("Matrix B:");
        printMatrix(matrixB, rows, cols);

        System.out.println("Resultant Matrix (Sum of A and B):");
        printMatrix(resultMatrix, rows, cols);

        scanner.close();
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
