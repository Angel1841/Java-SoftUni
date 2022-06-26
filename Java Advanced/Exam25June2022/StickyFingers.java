import java.util.Scanner;

public class StickyFingers {

    private static int thiefRow;
    private static int thiefCol;

    private static int pocket;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(",");

        char[][] field = new char[n][n];

        for (int i = 0; i < n; i++) {
            char[] line = scanner.nextLine().replace(" ","").toCharArray();

            field[i] = line;

            for (int j = 0; j < n; j++) {
                if(field[i][j] == 'D'){
                    thiefRow = i;
                    thiefCol = j;
                }
            }
        }

        for (int i = 0; i < commands.length; i++) {

            String command = commands[i];

            int oldRow = thiefRow;
            int oldCol = thiefCol;

            switch (command){
                case"up":
                    if (inTrack(field, thiefRow - 1, thiefCol)){
                        thiefRow -= 1;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case"down":
                    if (inTrack(field, thiefRow + 1, thiefCol)){
                        thiefRow += 1;
                    }  else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case"left":
                    if (inTrack(field, thiefRow, thiefCol - 1)){
                        thiefCol -= 1;
                    }  else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case"right":
                    if (inTrack(field, thiefRow, thiefCol + 1)){
                        thiefCol += 1;
                    }  else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
            }

            if(field[thiefRow][thiefCol] == '$'){
                pocket += thiefRow * thiefCol;
                System.out.printf("You successfully stole %d$.%n", thiefRow * thiefCol);

            } else if(field[thiefRow][thiefCol] == 'P'){
                System.out.printf("You got caught with %d$, and you are going to jail.%n", pocket);

                field[oldRow][oldCol] = '+';
                field[thiefRow][thiefCol] = '#';

                printArray(field);
                return;
            }

            field[oldRow][oldCol] = '+';
            field[thiefRow][thiefCol] = 'D';

        }


        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", pocket);
        printArray(field);

    }

    private static void printArray(char[][] field) {
        for (char[] arr : field) {
            for (char c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }


    private static boolean inTrack(char[][] field, int r, int c) {
        return r >= 0 && c >= 0 && r < field.length && c < field[r].length;
    }
}
