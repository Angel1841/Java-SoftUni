import java.util.Arrays;
import java.util.Scanner;

public class DIagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix[row] = line;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        int row = n - 1;
        int col = 0;

        while(row >= 0 && row < n && col >= 0 && col < n){
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }

    }
}
