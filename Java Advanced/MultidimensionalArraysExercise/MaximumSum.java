import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxSum = Integer.MIN_VALUE;

        int[] matrixSize = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = line;
        }

        int[][] outputMatrix = new int[3][3];

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if(currentSum > maxSum){
                    maxSum = currentSum;

                    outputMatrix = new int[][]{
                            {matrix[row][col], matrix[row][col + 1], matrix[row][col + 2]},
                            {matrix[row + 1][col], matrix[row + 1][col + 1], matrix[row + 1][col + 2]},
                            {matrix[row + 2][col], matrix[row + 2][col + 1], matrix[row + 2][col + 2]},

                    };
                }
            }
        }

        System.out.printf("Sum = %d%n", maxSum);

        for (int row = 0; row < outputMatrix.length; row++) {
            for (int col = 0; col < outputMatrix[row].length; col++) {
                System.out.print(outputMatrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
