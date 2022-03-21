import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        int brDays = Integer.parseInt(scanner.nextLine());
        int brTickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int cinemaPercent = Integer.parseInt(scanner.nextLine());


        double daySum =(brTickets * ticketPrice)*brDays;
        double sum = daySum - (daySum * cinemaPercent / 100);
        System.out.printf("The profit from the movie %s is %.2f lv.",filmName,sum);
    }
}
