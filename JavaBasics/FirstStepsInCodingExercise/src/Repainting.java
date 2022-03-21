import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonSum = (nylon + 2) * 1.50;
        double paintSum = (paint + paint * 0.10) * 14.50;
        double paintThinnerSum = paintThinner * 5.00;
        double bags = 0.40;
        double materials = nylonSum + paintSum+ paintThinnerSum + bags;
        double hoursSum = hours * (materials * 0.3);

        double sum = materials + hoursSum;
        System.out.println(sum);


    }
}
