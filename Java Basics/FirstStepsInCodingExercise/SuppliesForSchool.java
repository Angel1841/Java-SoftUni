import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double MoneyNoDiscount = (pens * 5.80) + (markers * 7.20) + (liters * 1.20);
        double MoneyWithDiscount = MoneyNoDiscount - (MoneyNoDiscount * discount /100);
        System.out.println(MoneyWithDiscount);
    }
}
