import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double moneySpent = 0;
        String base = "";


        switch(season){
            case "summer":
                base = "Camp";

                if(budget <= 100){
                    moneySpent = budget * 0.30;
                    System.out.printf("Somewhere in Bulgaria\n%s - %.2f", base, moneySpent);
                } else if(budget <= 1000){
                    moneySpent = budget * 0.40;
                    System.out.printf("Somewhere in Balkans\n%s - %.2f", base, moneySpent);
                } else {
                    base = "Hotel";
                    moneySpent = budget * 0.90;
                    System.out.printf("Somewhere in Europe\n%s - %.2f", base, moneySpent);
                }
            break;

            case "winter":
                base = "Hotel";

                if(budget <= 100){
                    moneySpent = budget * 0.70;
                    System.out.printf("Somewhere in Bulgaria\n%s - %.2f", base, moneySpent);
                } else if(budget <= 1000){
                    moneySpent = budget * 0.80;
                    System.out.printf("Somewhere in Balkans\n%s - %.2f", base, moneySpent);
                } else {
                    moneySpent = budget * 0.90;
                    System.out.printf("Somewhere in Europe\n%s - %.2f", base, moneySpent);
                }
                break;
        }

    }
}
