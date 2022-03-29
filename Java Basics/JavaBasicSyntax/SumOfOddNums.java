import java.util.Scanner;

public class SumOfOddNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 1;

        for(int i = n; i>0 ;i--)
        {
            sum += currentNum;
            System.out.println(currentNum);
            currentNum += 2;
        }
        System.out.printf("Sum: %d",sum);
    }
}
