import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i<n;i++){
            int number = Integer.parseInt(scanner.nextLine());

            if (number < smallest) smallest = number;
            if (number > biggest) biggest = number;

        }

        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d",smallest);
    }
}
