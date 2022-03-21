import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brDancers = Integer.parseInt(scanner.nextLine());
        double brPoints = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double money = 0;

        if(place.equals("Bulgaria")){
            money = brPoints * brDancers;

            if(season.equals("summer")){
                money = money -(money *0.05);
            }else if(season.equals("winter")){
                money = money -(money * 0.08);
            }

        }
        if(place.equals("Abroad")){
            money = brPoints * brDancers;
            money = money + (money * 0.50);

            if(season.equals("summer")){
                money = money -(money *0.10);
            }else if(season.equals("winter")){
                money = money -(money * 0.15);
            }
        }

        double leftMoney = money - (money *0.75);
        double moneyPerPerson = leftMoney / brDancers;

        System.out.printf("Charity - %.2f\nMoney per dancer - %.2f",money*0.75,moneyPerPerson);
    }
}
