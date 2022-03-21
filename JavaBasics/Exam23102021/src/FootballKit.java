import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double sumToReach = Double.parseDouble(scanner.nextLine());

        double cenaNaShorti = shirtPrice * 0.75;
        double chorapiPrice = cenaNaShorti * 0.20;
        double bootsPrice = (shirtPrice + cenaNaShorti) * 2;

        double sum = shirtPrice + cenaNaShorti + chorapiPrice + bootsPrice;
        double sumWithDiscount = sum - (sum * 0.15);

        if(sumWithDiscount >= sumToReach){
            System.out.printf("Yes, he will earn the world-cup replica ball!\nHis sum is %.2f lv.",sumWithDiscount);
        }else{
            System.out.printf("No, he will not earn the world-cup replica ball.\nHe needs %.2f lv. more.", sumToReach - sumWithDiscount);
        }



    }
}
