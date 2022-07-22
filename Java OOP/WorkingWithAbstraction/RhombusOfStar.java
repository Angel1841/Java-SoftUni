import java.util.Scanner;

public class RhombusOfStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRombus(n);
    }

    private static void printRombus(int n) {

        printTopPart(n);
        printBotPart(n);

    }

    private static void printBotPart(int n) {
        for (int k = n - 1; k > 0; k--) {

            for (int j = 0; j < n - k; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= k; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }

    private static void printTopPart(int size) {
        for (int i = 1; i <= size; i++) {

            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


}
