import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Matrix(n);

    }

    private static void Matrix(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
