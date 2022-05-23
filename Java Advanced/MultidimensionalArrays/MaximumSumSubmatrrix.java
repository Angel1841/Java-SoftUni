import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumSubmatrrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

            matrix[row] = line;
        }

        int[][] outputMatrix = new int[2][2];

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {

                int currentSum = matrix[row][col] + matrix[row + 1][col] + matrix[row][col + 1] + matrix[row + 1][col + 1];

                if (currentSum > maxSum) {

                    maxSum = currentSum;

                    outputMatrix = new int[][]{
                            {matrix[row][col], matrix[row][col + 1]},
                            {matrix[row + 1][col], matrix[row + 1][col + 1]},
                    };

                }
            }
        }

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(outputMatrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println(maxSum);
    }
}
