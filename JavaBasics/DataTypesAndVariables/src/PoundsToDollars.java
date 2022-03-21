import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal brit = new BigDecimal(scanner.nextLine());

        System.out.printf("%.3f",brit.multiply(BigDecimal.valueOf(1.36)));
    }
}
