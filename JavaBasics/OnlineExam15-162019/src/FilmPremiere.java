import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        String filmPacket = scanner.nextLine();
        int brTickets = Integer.parseInt(scanner.nextLine());
        double extra = 0;
        double ticketSum = 0;

        if (film.equals("John Wick")) {
            if(filmPacket.equals("Drink")){
                extra = extra + 12;
            }
            if(filmPacket.equals("Popcorn")){
                extra = extra + 15;
            }
            if(filmPacket.equals("Menu")){
                extra = extra + 19;
            }
            ticketSum = extra * brTickets;
        }
        if (film.equals("Star Wars")) {

            if(filmPacket.equals("Drink")){
                extra = extra + 18;
            }
            if(filmPacket.equals("Popcorn")){
                extra = extra + 25;
            }
            if(filmPacket.equals("Menu")){
                extra = extra + 30;
            }

            ticketSum = extra * brTickets;

            if(brTickets >=4){
                ticketSum = ticketSum - (ticketSum * 0.30);
            }
        }

        if (film.equals("Jumanji")) {
            if(filmPacket.equals("Drink")){
                extra = extra + 9;
            }
            if(filmPacket.equals("Popcorn")){
                extra = extra + 11;
            }
            if(filmPacket.equals("Menu")){
                extra = extra + 14;
            }

            ticketSum = extra * brTickets;

            if(brTickets == 2){
                ticketSum = ticketSum - (ticketSum * 0.15);
            }
        }

        System.out.printf("Your bill is %.2f leva.", ticketSum);
    }
}
