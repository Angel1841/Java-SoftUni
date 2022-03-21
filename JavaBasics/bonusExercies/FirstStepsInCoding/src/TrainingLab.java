import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double DesksPerLine = Math.floor(((h * 100) - 100) / 70) ;
        double DesksNumber = Math.floor(((w*100) / 120)) ;

        double NumberOfSeats = (DesksPerLine * DesksNumber) - 3;
        System.out.println(NumberOfSeats);
    }
}
