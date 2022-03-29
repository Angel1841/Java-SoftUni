import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        double division = FirstFactorial(a) / SecondFactorial(b);
        System.out.printf("%.2f",division);

    }

    public static double FirstFactorial(int a){

        double result = 1.00;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }
         return result;
    }

    public static double SecondFactorial(int b){

        double start = 1.00;

        for (int i = 1; i <= b; i++) {
            start *= i;
        }
        return start;
    }

}
