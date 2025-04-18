import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        System.out.println("Enter elements of Matrix 1 (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix 2 (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix2[i][j] = sc.nextInt();

        int[][] sum = new int[2][2];
        int[][] diff = new int[2][2];
        int[][] product = new int[2][2];

        // Addition and Subtraction
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            }

        // Multiplication
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    product[i][j] += matrix1[i][k] * matrix2[k][j];

        System.out.println("\nAddition:");
        printMatrix(sum);

        System.out.println("\nSubtraction:");
        printMatrix(diff);

        System.out.println("\nMultiplication:");
        printMatrix(product);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
