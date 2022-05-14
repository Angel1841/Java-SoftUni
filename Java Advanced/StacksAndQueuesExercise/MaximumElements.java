import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] elements = scanner.nextLine().split(" ");

            String command = elements[0];
            switch (command){
                case"1":
                    int x = Integer.parseInt(elements[1]);
                    stack.push(x);
                    break;

                case"2":
                    stack.pop();
                    break;

                case"3":
                    int max = Integer.MIN_VALUE;

                    for (var item: stack) {
                        if(item > max){
                            max = item;
                        }
                    }
                    System.out.println(max);
                    break;

            }

        }
    }
}
