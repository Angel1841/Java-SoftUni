import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = line;
        }

        int r = matrix.length - 1;
        int c = matrix[0].length - 1;

        for (int i = 0; i < rows + cols - 1; i++) {
            printDiagonal(r, c, matrix);
            c--;
            System.out.println();
        }
    }


    private static void printDiagonal(int row, int col, int[][] matrix) {
        while(row >= 0  && col < matrix[0].length) {
            if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
                System.out.print(matrix[row][col] + " ");
            }
            row--;
            col++;
        }
    }


}
