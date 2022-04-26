import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cities = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;

        for (int i = 1; i <= cities; i++) {

            String name = scanner.nextLine();
            double moneyEarned = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            double currentProfit = moneyEarned - expenses;

            if(i % 3 == 0) {
                double addCosts = expenses / 2;
                currentProfit -= addCosts;
            }
            if (i % 5 == 0) {
                moneyEarned *= 0.9;
                currentProfit = moneyEarned - expenses;
            }

            totalProfit += currentProfit;

            System.out.printf("In %s Burger Bus earned %.2f leva.\n",name,currentProfit);
        }

        System.out.printf("Burger Bus total profit: %.2f leva.",totalProfit);
    }
}
