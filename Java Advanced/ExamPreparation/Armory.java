import java.util.Scanner;

public class Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentBudget = 0;

        char[][] matrix = new char[n][n];

        int playerRow = 0;
        int playerCol = 0;

        for (int row = 0; row < n; row++) {
            String currLine = scanner.nextLine();
            for (int col = 0; col < n; col++) {
                char currChar = currLine.charAt(col);
                matrix[row][col] = currChar;
                if (currChar == 'A') {
                    playerRow = row;
                    playerCol = col;
                }
            }
        }

        String command = scanner.nextLine();

        boolean inArmory = true;

        char currentSym = ' ';



        while (true) {

            switch (command) {
                case "left":
                    if (canMoveLeft(playerCol)) {

                        matrix[playerRow][playerCol] = '-';

                        playerCol -= 1;

                        currentSym = matrix[playerRow][playerCol];

                    } else {
                        inArmory = false;
                    }

                    break;

                case "right":

                    if (canMoveRight(playerCol, n)) {

                        matrix[playerRow][playerCol] = '-';

                        playerCol += 1;

                        currentSym = matrix[playerRow][playerCol];


                    } else {
                        inArmory = false;
                    }
                    break;

                case "down":
                    if (canMoveDown(playerRow, n)) {

                        matrix[playerRow][playerCol] = '-';

                        playerRow += 1;

                        currentSym = matrix[playerRow][playerCol];

                    } else {

                        inArmory = false;
                    }

                    break;

                case "up":
                    if (canMoveUp(playerRow)) {

                        matrix[playerRow][playerCol] = '-';

                        playerRow -= 1;

                        currentSym = matrix[playerRow][playerCol];

                    } else {

                        inArmory = false;
                    }

                    break;
            }



            if(!inArmory){
                matrix[playerRow][playerCol] = '-';
                break;
            }

            if (Character.isDigit(currentSym)) {
                currentBudget += Integer.parseInt(String.valueOf(currentSym));

            } else if (currentSym == 'M') {

                matrix[playerRow][playerCol] = '-';

                int[] currentPosition = findOtherPillar(matrix);

                playerRow = currentPosition[0];
                playerCol = currentPosition[1];


            }

            matrix[playerRow][playerCol] = 'A';

            if(hasReachedCoins(currentBudget)){
                break;
            }

            command = scanner.nextLine();
        }

        if (hasReachedCoins(currentBudget)) {
            System.out.println("Very nice swords, I will come back for more!");
        }

        if (!inArmory) {
            System.out.println("I do not need more swords!");
        }

        System.out.printf("The king paid %d gold coins.%n", currentBudget);

        printMatrix(matrix);

    }
    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static int[] findOtherPillar(char[][] matrix) {
        int[] otherPillarPosition = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char currChar = matrix[row][col];
                if (currChar == 'M') {
                    otherPillarPosition[0] = row;
                    otherPillarPosition[1] = col;
                }
            }
        }
        return otherPillarPosition;
    }


    private static boolean hasReachedCoins(int currentBudget) {
        return currentBudget >= 65;
    }

    private static boolean canMoveUp(int playerRow) {
        return playerRow >= 1;
    }

    private static boolean canMoveRight(int playerCol, int size) {

        return playerCol <= size - 1;
    }

    private static boolean canMoveLeft(int playerCol) {
        return playerCol >= 1;
    }

    private static boolean canMoveDown(int playerRow, int size) {
        return playerRow <= size - 1;
    }

}
