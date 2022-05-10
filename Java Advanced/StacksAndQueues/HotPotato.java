import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(" ");

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> winner = new ArrayDeque<>();

        for (String s : people) {
            winner.offer(s);
        }

        while(winner.size() > 1){
            for (int i = 1; i < n; i++) {
                    winner.offer(winner.poll());
            }
            System.out.printf("Removed %s%n", winner.poll());
        }

        System.out.printf("Last is %s",winner.poll());
    }
}
