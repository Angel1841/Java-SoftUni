import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int AllPages = Integer.parseInt(scanner.nextLine());
        int PagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hours = ((AllPages/days)/PagesPerHour);
        System.out.println(hours);

    }
}
