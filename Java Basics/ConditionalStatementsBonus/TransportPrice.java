import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (n>20 && n<100) {
            double busTax = n * 0.09;
            System.out.printf("%.2f",busTax);
        } else if (n >= 100){
            double trainTax = n * 0.06;
            System.out.printf("%.2f",trainTax);
        } else if(n<20 && day.equals("day")){
            double taxi1Tax = 0.70 + (0.79 * n);
            System.out.printf("%.2f",taxi1Tax);
        } else if(n<20 && day.equals("night")){
            double taxi2Tax = 0.70 + (0.90 * n);
            System.out.printf("%.2f",taxi2Tax);
        }


    }
}
