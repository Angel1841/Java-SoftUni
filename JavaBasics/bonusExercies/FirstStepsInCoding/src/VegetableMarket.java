import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetables = Double.parseDouble(scanner.nextLine());
        double fruits = Double.parseDouble(scanner.nextLine());
        int VegetablesKg = Integer.parseInt(scanner.nextLine());
        int FruitsKg = Integer.parseInt(scanner.nextLine());

        double sum = ((vegetables * VegetablesKg) + (fruits * FruitsKg)) / 1.94;

        System.out.printf("%.2f", sum);

    }
}
