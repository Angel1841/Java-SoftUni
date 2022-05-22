import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < m; j++) {
                matrix[i][j] = line[j];
            }

        }

        String[] tokens2 = scanner.nextLine().split(" ");

        int f = Integer.parseInt(tokens2[0]);
        int x = Integer.parseInt(tokens2[1]);

        int[][] matrix2 = new int[f][x];

        for (int i = 0; i < f; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < x; j++) {
                matrix2[i][j] = line[j];
            }

        }


        if (isTrue(matrix, matrix2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }


    public static boolean isTrue(int[][] matrix1, int[][] matrix2) {

        if (matrix1.length != matrix2.length) return false;
        for (int row = 0; row < matrix1.length; row++) {
            if (matrix1[row].length != matrix2[row].length) return false;

            for (int col = 0; col < matrix1[row].length; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    return false;
                }
            }

        }

        return true;
    }
}
