import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double MenuWithoutDesert = (chickenMenu * 10.35) + (fishMenu * 12.40) + (vegetarianMenu * 8.15);
        double desert = MenuWithoutDesert * 0.20;

        double MenuWithDesert = MenuWithoutDesert + desert + 2.50;
        System.out.println(MenuWithDesert);


    }
}
