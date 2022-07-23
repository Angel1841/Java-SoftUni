package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = getCoordinates(scanner);

        Point A = new Point(coordinates[0], coordinates[1]);
        Point B = new Point(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(A, B);

        int n = Integer.parseInt(scanner.nextLine());

        while(n --> 0){

            int[] pointCoordinates = getCoordinates(scanner);

            Point x = new Point(pointCoordinates[0], pointCoordinates[1]);

            boolean isInside = rectangle.contains(x);

            System.out.println(isInside);
        }

    }

    private static int[] getCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
