import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;


        if(statists>150){
            pricePerStatist = pricePerStatist - pricePerStatist * 0.10;
        }

        double sum = pricePerStatist * statists + decor;

        if(budget >= sum){
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", budget - sum);
        } else{
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", sum - budget);
        }
    }
}
