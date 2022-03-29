import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int brNights = Integer.parseInt(scanner.nextLine());
        double pricePerNightAp = 0;
        double pricePerNightStu = 0;

        if (month.equals("May") || month.equals("October")) {
            pricePerNightAp = 65.00;
            pricePerNightStu = 50.00;

            if (brNights > 7) {
                double fullPriceStu = pricePerNightStu * brNights;
                fullPriceStu = fullPriceStu - (fullPriceStu * 0.05);

                double fullpriceAp = pricePerNightAp * brNights;

                System.out.printf("Apartment: %.2f\nStudio: %.2f", fullpriceAp, fullPriceStu);
            } else if (brNights > 14) {
                double fullPriceStu = pricePerNightStu * brNights;
                fullPriceStu = fullPriceStu - (fullPriceStu * 0.30);

                double fullpriceAp = pricePerNightAp * brNights;
                fullpriceAp = fullpriceAp - (fullpriceAp * 0.10);

                System.out.printf("Apartment: %.2f\nStudio: %.2f", fullpriceAp, fullPriceStu);
            } else {
                double fullPriceAp = pricePerNightAp * brNights;

                double fullpriceStu = pricePerNightStu * brNights;

                System.out.printf("Apartment: %.2f\nStudio: %.2f", fullPriceAp, fullpriceStu);
            }

        }
        if (month.equals("June") || month.equals("September")){
            pricePerNightAp = 68.70;
            pricePerNightStu = 75.20;
            if(brNights >14){
                double fullPriceAp = pricePerNightAp * brNights;
                fullPriceAp = fullPriceAp - (fullPriceAp * 0.20);

                double fullpriceStu = pricePerNightStu * brNights;

                System.out.printf("Apartment: %.2f\nStudio: %.2f", fullPriceAp, fullpriceStu);

            } else{
                double fullPriceAp = pricePerNightAp * brNights;

                double fullpriceStu = pricePerNightStu * brNights;

                System.out.printf("Apartment: %.2f\nStudio: %.2f", fullPriceAp, fullpriceStu);
            }
        } else if(month.equals("July") || month.equals("August")){

        }
    }
}
