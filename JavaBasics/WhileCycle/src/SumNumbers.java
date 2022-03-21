import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int input;

        while(sum < n){
            input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }
        System.out.println(sum);

    }
}
