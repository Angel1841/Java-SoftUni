import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(" ");

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> winner = new ArrayDeque<>();

        int temp = 1;

        for (String s : people) {
            winner.offer(s);
        }

        while (winner.size() > 1) {

            for (int i = 1; i < n; i++) {
                winner.offer(winner.poll());
                temp++;
            }

            if (isPrime(temp)) {
                System.out.printf("Prime %s%n",winner.peek());
            }else {
                System.out.printf("Removed %s%n",winner.poll());
            }

        }

        System.out.printf("Last is %s",winner.poll());

    }

    private static boolean isPrime(int n) {

        boolean flag = true;

        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

}
