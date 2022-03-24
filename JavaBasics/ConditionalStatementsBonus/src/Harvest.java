import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xM = Integer.parseInt(scanner.nextLine());
        double yM = Double.parseDouble(scanner.nextLine());
        int zL = Integer.parseInt(scanner.nextLine());
        int numWorkers = Integer.parseInt(scanner.nextLine());

        double grapeSum = xM * yM;
        double wineSum = grapeSum * 0.4 / 2.5;

        if (zL > wineSum) {
            double neededWine = zL - wineSum;
            neededWine = Math.floor(neededWine);

            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", neededWine);

        } else if (wineSum >= zL) {
            double leftWine = wineSum - zL;
            wineSum = Math.floor(wineSum);

            double LitersPerPerson = leftWine / numWorkers;
            leftWine = Math.ceil(leftWine);
            LitersPerPerson = Math.ceil(LitersPerPerson);


            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n%.0f liters left -> %.0f liters per person.", wineSum, leftWine, LitersPerPerson);

        }

    }
}
