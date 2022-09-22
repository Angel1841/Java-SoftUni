import java.util.Enumeration;
import java.util.Optional;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double number = -1;

        try{
            number = Double.parseDouble(input);
            System.out.printf("%.2f%n",sqrt(number));
        } catch(IllegalArgumentException e){
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");

        }

    }

    private static double sqrt(double number){
        if(number < 0) {
            throw new IllegalArgumentException("Invalid");
        }
           return Math.sqrt(number);
    }
}
