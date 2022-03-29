import java.util.Scanner;

public class MetersToKms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double km = meters * 0.001;
        System.out.printf("%.2f",km);
    }
}
