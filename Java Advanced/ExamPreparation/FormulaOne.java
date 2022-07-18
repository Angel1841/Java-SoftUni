import java.util.Scanner;

public class FormulaOne {

    private static int playerRow = 0;
    private static int playerCol = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean hasFinished = false;

        int n = Integer.parseInt(scanner.nextLine());
        int numCommands = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();

            if(line.contains("P")){
                playerRow = i;
                playerCol = line.indexOf("P");
            }
        }

        for (int i = 0; i < numCommands; i++) {

            String command = scanner.nextLine();

            int oldRow = playerRow;
            int oldCol = playerCol;

            moveRacer(field,playerRow, playerCol,command);

            if(field[playerRow][playerCol] == 'B'){
                moveRacer(field,playerRow, playerCol,command);
                field[oldRow][oldCol] = '.';
                field[playerRow][playerCol] = 'P';
            } else if(field[playerRow][playerCol] == 'T'){
                playerRow = oldRow;
                playerCol = oldCol;
            } else if (field[playerRow][playerCol] == 'F'){
                hasFinished = true;

                field[oldRow][oldCol] = '.';
                field[playerRow][playerCol] = 'P';
            } else {
                field[oldRow][oldCol] = '.';
                field[playerRow][playerCol] = 'P';
            }

            if(hasFinished){
                System.out.println("Well done, the player won first place!");
                printArray(field);
                return;
            }

        }

        System.out.println("Oh no, the player got lost on the track!");
        printArray(field);

    }


    private static void moveRacer(char[][] field, int row, int col, String command) {

        switch (command){
            case"left":
                if(inTrack(field, row, col - 1)){
                    playerCol -= 1;
                } else {
                    playerCol = field.length - 1;
                }
                break;

            case"right":
                if(inTrack(field, row, col + 1)){
                    playerCol += 1;
                } else {
                    playerCol = 0;
                }
                break;

            case"up":
                if(inTrack(field, row - 1, col)){
                    playerRow -= 1;
                } else {
                    playerRow = field.length - 1;
                }
                break;

            case"down":
                if(inTrack(field, row + 1, col)){
                    playerRow += 1;
                } else {
                    playerRow = 0;
                }
                break;

        }

    }

    private static void printArray(char[][] field) {
        for (char[] arr : field) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    private static boolean inTrack(char[][] field, int r, int c) {
        return r >= 0 && c >= 0 && r < field.length && c < field[r].length;
    }
}
