import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int rams = Integer.parseInt(scanner.nextLine());

        double videocardsPrice = 250 * videocards;
        double processorPrice = videocardsPrice * 0.35;
        double ramsPrice = videocardsPrice * 0.10 ;

        double totalPrice = videocardsPrice + processors * processorPrice + rams * ramsPrice;

        if(videocards > processors){
        totalPrice = totalPrice - totalPrice * 0.15;

        }


        if(budget >= totalPrice){
            System.out.printf("You have %.2f leva left!",budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }

    }
}
