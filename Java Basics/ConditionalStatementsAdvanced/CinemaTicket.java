import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")){
            System.out.println(12);
        } else if (day.equals("Wednesday") || day.equals("Thursday")){
            System.out.println(14);
        } else if (day.equals("Saturday") || day.equals("Sunday")){
            System.out.println(16);
        }
    }
}
