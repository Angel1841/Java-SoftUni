import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        if (grade >= 5.00)
            System.out.println("Excellent!");
        else
            System.out.println(" ");

        }
}

