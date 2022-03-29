import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int flowersBr = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double fullPrice = 0;

        switch (flower) {
            case "Roses":
                fullPrice = flowersBr * 5.00;
                if (flowersBr > 80) {
                    fullPrice = fullPrice - (fullPrice * 0.10);
                }
                break;

            case "Dahlias":
                fullPrice = flowersBr * 3.80;
                if (flowersBr > 90) {
                    fullPrice = fullPrice - (fullPrice * 0.15);
                }
                break;

            case "Tulips":
                fullPrice = flowersBr * 2.80;
                if (flowersBr > 80) {
                    fullPrice = fullPrice - (fullPrice * 0.15);
                }
                break;

            case "Narcissus":
                if (flowersBr < 120) {
                    fullPrice = flowersBr * (3.00 + (3.00 * 0.15));
                } else {
                    fullPrice = flowersBr * 3.00;
                }
                break;

            case "Gladiolus":
                if (flowersBr < 80) {
                    fullPrice = flowersBr * (2.50 + (2.50 * 0.20));
                } else {
                    fullPrice = flowersBr * 2.50;
                }
                break;
        }

        if (budget < fullPrice) {
            System.out.printf("Not enough money, you need %.2f leva more.", fullPrice - budget);
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersBr, flower, budget - fullPrice);
        }

    }
}