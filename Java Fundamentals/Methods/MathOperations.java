import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f",Calc(a,operator,b));

    }

    public static double Calc(double a, String operator, double b){

        double result = 0.0;

        switch (operator){
            case"+":
                result = a + b;
                break;
            case"*":
                result = a * b;
                break;
            case"-":
                result = a - b;
                break;
            case"/":
                result = a / b;
                break;
        }

        return result;
    }
}
