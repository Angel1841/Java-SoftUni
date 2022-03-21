import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",town,number1,number2);
    }
}
