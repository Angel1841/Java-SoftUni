import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double n1 = Integer.parseInt(scanner.nextLine());
            double n2 = Integer.parseInt(scanner.nextLine());
            String symbol = scanner.nextLine();

            switch(symbol){
                case "+":
                    if((n1 + n2) % 2 == 0){
                        System.out.printf("%.0f %s %.0f = %.0f - even",n1 ,symbol,n2, n1+n2);
                    } else{
                        System.out.printf("%.0f %s %.0f = %.0f - odd",n1 ,symbol,n2, n1+n2);
                    }
                    break;

                case "-":
                    if((n1 - n2) % 2 == 0){
                        System.out.printf("%.0f %s %.0f = %.0f - even",n1 ,symbol,n2, n1-n2);
                    } else{
                        System.out.printf("%.0f %s %.0f = %.0f - odd",n1 ,symbol,n2, n1-n2);
                    }
                    break;

                case "/":
                    if(n2 == 0)
                        System.out.printf("Cannot divide %.0f by zero", n1);

                    else{
                        System.out.printf("%.0f %s %.0f = %.2f" ,n1 ,symbol,n2, n1/n2);
                    }
                break;

                case "*":
                    if((n1 * n2) % 2 == 0){
                        System.out.printf("%.0f %s %.0f = %.0f - even",n1 ,symbol,n2, n1*n2);
                    } else{
                        System.out.printf("%.0f %s %.0f = %.0f - odd",n1 ,symbol,n2, n1*n2);
                    }
                    break;

                case "%":
                    if(n2 == 0)
                        System.out.printf("Cannot divide %.0f by zero", n1);
                    else{
                        System.out.printf("%.0f %s %.0f = %.0f",n1 ,symbol,n2, n1%n2);
                    }
                    break;
            }


    }
}
