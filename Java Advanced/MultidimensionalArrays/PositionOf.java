import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        int rols = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rols][cols];


        for (int row = 0; row < rols; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int column = 0; column < cols; column++) {
                matrix[row][column] = line[column];
            }

        }

        boolean isFound = false;

        int searched = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < rols; row++) {
            for (int column = 0; column < cols; column++) {
                if(matrix[row][column] == searched){

                    System.out.printf("%d %d%n",row, column);

                    isFound = true;
                }
            }

        }

        if(!isFound){
            System.out.println("not found");
        }


    }
}
