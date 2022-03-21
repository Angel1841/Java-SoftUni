import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String numbers = scanner.nextLine();
            String[] splitNumbers = numbers.split(" ");

            long leftNum = Long.parseLong(splitNumbers[0]);
            long rightNum = Long.parseLong(splitNumbers[1]);

            int sum =0;
            long biggerNum = 0;

            if (leftNum > rightNum) {
                biggerNum = leftNum;
            } else {
                biggerNum = rightNum;
            }

            while(biggerNum !=0){
                sum += biggerNum % 10;
                biggerNum /= 10;
            }

            System.out.println(Math.abs(sum));
        }

    }
}
