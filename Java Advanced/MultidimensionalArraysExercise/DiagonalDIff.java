import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDIff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {

            int[] line = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = line;
        }

        int mainDiagSum = 0;
        int secondDiagSum = 0;

        for (int row = 0; row < n; row++) {
                mainDiagSum += matrix[row][row];
        }

        for (int row = 0, col = n - 1; row < n; row++, col--) {
            secondDiagSum += matrix[row][col];
        }

        System.out.println(Math.abs(mainDiagSum - secondDiagSum));

    }
}
