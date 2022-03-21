import java.util.Scanner;

public class Serials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int serialsBr = Integer.parseInt(scanner.nextLine());

        double pricePerSerial = 0;
        double sum = 0;

        for(int i=0;i<serialsBr;i++){
            String serial = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            if(serial.equals("Thrones")){
                pricePerSerial = price - (price * 0.50);
            }
            else if(serial.equals("Lucifer")){
                pricePerSerial = price - (price * 0.40);
            }
            else if(serial.equals("Protector")){
                pricePerSerial = price - (price * 0.30);
            }
            else if(serial.equals("TotalDrama")){
                pricePerSerial = price - (price * 0.20);
            }
            else if(serial.equals("Area")){
                pricePerSerial = price - (price * 0.10);
            } else{
                pricePerSerial = price;
            }

                sum = sum + pricePerSerial;

        }

        if(budget>=sum){
            System.out.printf("You bought all the series and left with %.2f lv.", budget - sum);
        } else{
            System.out.printf("You need %.2f lv. more to buy the series!",sum-budget);
        }
    }
}
