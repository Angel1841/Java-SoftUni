import java.util.Scanner;

public class MouseAndCheese {

    private static int row = 0;
    private static int col = 0;
    private static int eatenCheese = 0;
    private static boolean mouseIsInField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();

            if(line.contains("M")){
                row = i;
                col = line.indexOf("M");
            }
        }

        String command = scanner.nextLine();

        while(!command.equals("end") && mouseIsInField){

            if(!isInBounds(field, row, col)){
                mouseIsInField = false;
                break;
            }

            switch (command){

                case"left":
                    moveMouse(field, 0, -1);
                    break;
                case"right":
                    moveMouse(field, 0, 1);
                    break;
                case"up":
                    moveMouse(field, -1, 0);
                    break;
                case"down":
                    moveMouse(field, 1, 0);
                    break;

            }

            if(!mouseIsInField){
                break;
            }

            command = scanner.nextLine();

        }

        if(!mouseIsInField){
            System.out.println("Where is the mouse?");
        }

        if(eatenCheese < 5){
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - eatenCheese);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", eatenCheese);
        }

        printArray(field);

    }

    private static void moveMouse(char[][] field, int rowMutator, int colMutator) {
        int nextRow = rowMutator + row;
        int nextCol = colMutator + col;

        boolean hasBonus = false;

        if(!isInBounds(field, nextRow, nextCol)){
            field[row][col] = '-';
            mouseIsInField = false;
            return;
        }

        if(field[nextRow][nextCol] == 'c'){
            eatenCheese++;
        } else if(field[nextRow][nextCol] == 'B'){
            hasBonus = true;
        }

        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';

        row = nextRow;
        col = nextCol;

        if(hasBonus){
            moveMouse(field, rowMutator, colMutator);
        }
    }

    private static boolean isInBounds (char[][] field, int r, int c){
        return r >= 0 && c >= 0 && r < field.length && c < field[r].length;
    }

    private static void printArray(char[][] field) {
        for (char[] arr : field) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
