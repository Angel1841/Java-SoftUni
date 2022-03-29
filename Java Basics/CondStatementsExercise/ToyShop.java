import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = (puzzles * 2.60) + (dolls * 3.00) + (bears * 4.10) + (minions * 8.20) + (trucks * 2.00);
        int toysCount = puzzles + dolls + bears + minions + trucks;

        if(toysCount >= 50){
            sum = sum - (sum * 0.25);

        }
        sum = sum -(sum * 0.10);

        if(sum >= excursionPrice){
            System.out.printf("Yes! %.2f lv left.", sum - excursionPrice);
        } else{
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - sum);
        }
    }
}
