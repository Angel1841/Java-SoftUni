import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maznini = Integer.parseInt(scanner.nextLine());
        int proteins = Integer.parseInt(scanner.nextLine());
        int vuglehidrati = Integer.parseInt(scanner.nextLine());
        int CaloriesSum = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double mazniniSum = (maznini * 0.01 * CaloriesSum) / 9;
        double proteinsSum = (proteins * 0.01 * CaloriesSum) / 4;
        double vuglehidratiSum = (vuglehidrati * 0.01 * CaloriesSum) / 4;

        double foodKg = mazniniSum + proteinsSum + vuglehidratiSum;
        double caloriesPerGram = CaloriesSum / foodKg;

        int leftPercents = 100 - percentWater;

        double caloriesLeft = (leftPercents * 0.01) * caloriesPerGram;
        System.out.printf("%.4f",caloriesLeft);
    }
}
