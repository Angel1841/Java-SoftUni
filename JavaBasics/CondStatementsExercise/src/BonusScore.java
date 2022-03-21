import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPoints = Integer.parseInt(scanner.nextLine());
        double bonusPoints;

        if(startPoints <= 100){
            bonusPoints = 5;
        } else if (startPoints > 1000){


            bonusPoints = startPoints * 0.1;
        } else {
            bonusPoints = startPoints * 0.2;
        }

        if(startPoints % 2 == 0){
            bonusPoints = bonusPoints + 1;
        }

        if(startPoints % 10 == 5){
            bonusPoints = bonusPoints + 2;
        }

        double sumPoints = bonusPoints + startPoints;

        System.out.printf("%.1f\n%.1f", bonusPoints, sumPoints);
    }
}
