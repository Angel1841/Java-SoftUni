import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPricePerKg = Double.parseDouble(scanner.nextLine());
        double spratPricePerKg = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int seashellsKg = Integer.parseInt(scanner.nextLine());

        double seashellprice = seashellsKg * 7.50;

        double sum = ((mackerelPricePerKg + (mackerelPricePerKg * 0.60))*bonitoKg) + ((spratPricePerKg + (spratPricePerKg * 0.80)) * scadKg) + seashellprice;
        System.out.printf("%.2f", sum);
    }
}
