import java.util.Scanner;

public class triugulniklice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = Float.parseFloat(scanner.nextLine());
        float h = Float.parseFloat(scanner.nextLine());
        double area = (a*h)/2;
        System.out.printf("%.2f",area);
    }
}
