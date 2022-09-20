package ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        Box box = new Box(a, b, c);

        System.out.println("Surface Area - " + box.calculateSurfaceArea());
        System.out.println("Lateral Surface Area - " + box.calculateLateralSurfaceArea());
        System.out.println("Volume – " + box.calculateVolume());


    }
}
