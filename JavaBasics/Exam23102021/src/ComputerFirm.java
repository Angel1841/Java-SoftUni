import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int ratingSum = 0;

        for(int i=0;i<n;i++){
            int number = Integer.parseInt(scanner.nextLine());

            int rating = number % 10;

            if(rating % 3 == 0){
                number = number / 10;
                sum = rating * (0.50 * number);
            }
            if(rating % 2 == 0){
                number = number / 10;
                sum = 0;
            }
            if(rating % 4 == 0){
                number = number / 10;
                sum = rating * (0.70 * number);
            }
            if(rating % 5 == 0){
                number = number / 10;
                sum = rating * (0.85 * number);
            }
            if(rating % 6 == 0){
                number = number / 10;
                sum = rating * number;
            }
            ratingSum += rating;
        }

        double average = ratingSum / n;

        System.out.printf("%.2f\n%.2f",sum,average);

    }
}
