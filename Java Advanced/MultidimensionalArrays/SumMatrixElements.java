import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        int sum = 0;

        for (int row = 0; row < rows; row++) {

            String[] line = scanner.nextLine().split(", ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
                sum += matrix[row][col];
            }
        }

        System.out.println(sum);

    }
}
