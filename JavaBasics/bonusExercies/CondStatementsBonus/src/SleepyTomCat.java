import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());
        int allDays = 365;

        int workingDays = allDays - daysOff;

        int playTimeOff = daysOff * 127;
        int playTimeWorking = workingDays * 63;

        int allTimePlaying = playTimeOff + playTimeWorking;

        if(allTimePlaying < 30000){
            int timeLeft = 30000 - allTimePlaying;
            int timeLeftHours = timeLeft / 60;
            int timeLeftMinutes = timeLeft % 60;


            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play",timeLeftHours,timeLeftMinutes);
        }

        else if(allTimePlaying > 30000){
            int timeOver = allTimePlaying - 30000;
            int timeOverHours = timeOver / 60;
            int timeOverMinutes = timeOver % 60;


            System.out.printf("Tom will run away\n%d hours and %d minutes more for play",timeOverHours,timeOverMinutes);
        }

    }
}
