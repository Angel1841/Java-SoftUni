import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = Integer.parseInt(scanner.nextLine());
        int s2 = Integer.parseInt(scanner.nextLine());
        int s3 = Integer.parseInt(scanner.nextLine());

        int timeMins = (s1 + s2 + s3) /60;
        int timeSeconds = (s1 + s2 + s3) % 60;

        System.out.printf("%d:%02d",timeMins,timeSeconds);

    }
}
