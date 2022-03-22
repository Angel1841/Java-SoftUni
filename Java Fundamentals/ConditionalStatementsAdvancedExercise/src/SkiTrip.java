import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String feedback = scanner.nextLine();

        double PricePerNight = 0.0;
        double discount = 0;

        int nights = days - 1;

        switch (typeRoom) {
            case "room for one person":
                PricePerNight = 18.00;
                discount = 0;
                break;

            case "apartment":
                PricePerNight = 25.00;
                if (nights < 10) {
                    discount = 0.30;
                } else if (nights <= 15) {
                    discount = 0.35;
                } else{
                    discount = 0.50;
                }
                break;

            case "president apartment":
                PricePerNight = 35.00;
                if (nights < 10) {
                    discount = 0.10;
                } else if (nights <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.20;
                }
                break;
        }

        double totalPrice = PricePerNight * nights;
        totalPrice = totalPrice - totalPrice * discount;

        switch(feedback){
            case "positive":
                totalPrice = totalPrice * 1.25;
                break;
            case "negative":
                totalPrice = totalPrice * 0.90;
                break;

        }
        System.out.printf("%.2f",totalPrice);
    }
}
