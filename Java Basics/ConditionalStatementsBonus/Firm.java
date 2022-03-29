import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int allDays = Integer.parseInt(scanner.nextLine());
        int brWorkers = Integer.parseInt(scanner.nextLine());

        double daysLeft = allDays - (allDays * 0.10);
        double hoursWorking = daysLeft * 8;
        double hoursOut = brWorkers * (2 * allDays);

        double sumHours = Math.floor(sumHours = hoursOut + hoursWorking);

        if(sumHours >= neededHours){
            System.out.printf("Yes!%.0f hours left.", sumHours - neededHours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.",neededHours - sumHours);
        }
    }
}
