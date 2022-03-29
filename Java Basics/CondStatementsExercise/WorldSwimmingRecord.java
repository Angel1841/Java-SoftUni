import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordToBeat = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double resistanceMeters = Math.floor(meters / 15);
        double resistance = resistanceMeters  * 12.5;

        double swimmingTime = (meters * secondsPerMeter) + resistance;

        if(swimmingTime > recordToBeat){
            System.out.printf("No, he failed! He was %.2f seconds slower.", swimmingTime - recordToBeat);
        } else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTime);
        }


    }
}
