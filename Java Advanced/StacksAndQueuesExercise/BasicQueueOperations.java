import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        String[] data = scanner.nextLine().split(" ");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            queue.offer(Integer.parseInt(data[i]));

        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }
        if (queue.contains(x)) {

            System.out.println("true");

        } else if (queue.isEmpty()) {

            System.out.println("0");

        } else {

            int min = Integer.MAX_VALUE;

            for (var item : queue) {
                if (item < min) {
                    min = item;
                }
            }

            System.out.println(min);
        }
    }
}
