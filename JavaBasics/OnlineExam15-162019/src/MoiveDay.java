import java.util.Scanner;

public class MoiveDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeForPhotos = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        double timePerScene = Double.parseDouble(scanner.nextLine());

        double readyTime = timeForPhotos * 0.15;

        double sumTimeToShoot = (scenes * timePerScene) + readyTime;

        if(timeForPhotos > sumTimeToShoot){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",timeForPhotos - sumTimeToShoot);
        } else{
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",sumTimeToShoot - timeForPhotos);
        }
    }
}
