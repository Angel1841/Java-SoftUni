import java.util.Scanner;

public class TrapecLice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double sum = (b1 + b2) * (h*1.00)/2;
        System.out.println(sum + "0");
    }
}
