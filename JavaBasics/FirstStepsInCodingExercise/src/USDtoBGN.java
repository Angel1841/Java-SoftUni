import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double conv = a * 1.79549;
        System.out.println(conv);
    }
}
