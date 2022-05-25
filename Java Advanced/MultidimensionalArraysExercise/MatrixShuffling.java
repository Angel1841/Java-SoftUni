import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensons = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dimensons[0]);
        int cols = Integer.parseInt(dimensons[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split(" ");
            matrix[row] = line;
        }

        String commands = scanner.nextLine();

        while(!commands.equals("END")){

            String[] tokens = commands.split(" ");
            String command = tokens[0];

            if(!command.equals("swap") || tokens.length != 5) {
                    System.out.println("Invalid input!");
                    commands = scanner.nextLine();
                    continue;
            }

                int row1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);
                int row2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);

                if(row1 < matrix.length && row1 >= 0 && row2 < matrix.length && row2 >= 0 && col1 < matrix[rows - 1].length && col1 >= 0 && col2 < matrix[rows - 1].length && col2 >= 0){

                    String firstEl = matrix[row1][col1];
                    String secondEl = matrix[row2][col2];

                    matrix[row1][col1] = secondEl;
                    matrix[row2][col2] = firstEl;

                    for (int row = 0; row < rows; row++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                        System.out.println();
                    }


                } else{
                    System.out.println("Invalid input!");
                }


            commands = scanner.nextLine();
        }
    }
}
