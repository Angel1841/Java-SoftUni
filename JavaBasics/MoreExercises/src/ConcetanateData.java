import java.util.Scanner;

public class ConcetanateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");

    }
}
