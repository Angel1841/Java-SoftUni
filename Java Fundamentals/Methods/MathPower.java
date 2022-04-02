import java.math.BigDecimal;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal a = new BigDecimal(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        BigDecimal result = Power(a,power);
        System.out.println(result);


    }

    static BigDecimal Power(BigDecimal a, int power){
        a = a.pow(power);
        return a;
    }
}
