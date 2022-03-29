import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Volume = Integer.parseInt(scanner.nextLine());
        int debit1 = Integer.parseInt(scanner.nextLine());
        int debit2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double filled1 = debit1 * hours;
        double filled2 = debit2 * hours;

        double debitsum = filled1 + filled2;

        double pipePercent1 = (filled1/debitsum)* 100;
        double pipePercent2 = (filled2/debitsum)* 100;

        double fullPercent = (debitsum/Volume) * 100;

        if(Volume > debitsum){

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",fullPercent,pipePercent1,pipePercent2);

        }
        else if (debitsum > Volume){
            double overflow;
            overflow = debitsum - Volume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hours,overflow);
        }
    }
}
