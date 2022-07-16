import java.util.Scanner;

public class Bomb {

    private static int row = 0;
    private static int col = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int allBombs = 0;
        int foundBombs = 0;

        String[] commands = scanner.nextLine().split(",");

        char[][] field = new char[n][n];

        for (int i = 0; i < n; i++) {
            char[] line = scanner.nextLine().replace(" ","").toCharArray();
            field[i] = line;

            for (int j = 0; j < n; j++) {
                if(field[i][j] == 's'){
                    row = i;
                    col = j;
                }

                if(field[i][j] == 'B'){
                    allBombs++;
                }
            }
        }

        for (int i = 0; i < commands.length; i++) {
            String currentCommand = commands[i];

            switch (currentCommand){
                case"up":
                    if(row != 0){
                        row--;
                    }
                    break;
                case"down":
                    if(row != n - 1){
                        row++;
                    }
                    break;
                case"left":
                    if(col != 0){
                        col--;
                    }

                    break;
                case"right":
                    if(col != n - 1){
                        col++;
                    }
                    break;
            }

            if(field[row][col] == 'B'){
                field[row][col] = '+';
                System.out.println("You found a bomb!");
                foundBombs++;
            } else if(field[row][col] == 'e'){
                if(foundBombs == allBombs){
                    System.out.println("Congratulations! You found all bombs!");
                } else {
                    System.out.printf("END! %d bombs left on the field", allBombs - foundBombs);
                }
                return;
            }

        }

        if(foundBombs != allBombs){
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", allBombs - foundBombs, row, col);
        } else {
            System.out.println("Congratulations! You found all bombs!");
        }

    }
}
