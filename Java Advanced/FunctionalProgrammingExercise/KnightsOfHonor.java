import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        Consumer<String> consumer = p -> System.out.println("Sir " + p);

        for (String human: tokens) {
            consumer.accept(human);
        }
    }
}
