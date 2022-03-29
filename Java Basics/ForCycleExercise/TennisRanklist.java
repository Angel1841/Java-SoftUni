import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int start = points;
        int wins = 0;

        for(int i=0; i<tournaments; i++)
        {
            String reached = scanner.nextLine();
            if(reached.equals("F")){
                points = points + 1200;

            } else if(reached.equals("SF")){
                points = points + 720;

            } else if(reached.equals("W")){
                points = points + 2000;
                wins++;
            }
        }

        int averagePoints = ((points - start) / tournaments);
        double percentWins = (wins * 1.0/ tournaments) * 100;

        System.out.printf("Final points: %d\nAverage points: %d\n%.2f%%",points,averagePoints,percentWins);

    }
}
