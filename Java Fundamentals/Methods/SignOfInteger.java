import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Solution(number);
    }

    static void Solution(int n) {
        if (n > 0) {
            System.out.printf("The number %d is positive.",n);
        }
        if (n < 0) {
            System.out.printf("The number %d is negative.",n);
        }
        if (n == 0) {
            System.out.printf("The number %d is zero.",n);
        }
    }
}
