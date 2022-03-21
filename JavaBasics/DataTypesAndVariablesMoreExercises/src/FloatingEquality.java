import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eps = 0.000001;


        while(true){

            double n1 = Double.parseDouble(scanner.nextLine());
            double n2 = Double.parseDouble(scanner.nextLine());

            boolean isEqual = Math.abs(n1 - n2) < eps;

            if(isEqual){
                System.out.println("True");
                return;
            } else{
                System.out.println("False");
                return;
            }
        }



    }
}
