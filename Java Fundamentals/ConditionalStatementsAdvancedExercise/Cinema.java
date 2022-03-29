import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double allPrice;

        if(projection.equals("Premiere")){
            allPrice = r * c * 12.00;
            System.out.printf("%.2f leva",allPrice);

        } else if(projection.equals("Normal")){

            allPrice = r * c * 7.50;
            System.out.printf("%.2f leva",allPrice);

        } else if(projection.equals("Discount")) {

            allPrice = r * c * 5.00;
            System.out.printf("%.2f leva", allPrice);
        }
    }
}
