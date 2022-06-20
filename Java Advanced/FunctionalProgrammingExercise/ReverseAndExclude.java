import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        input.removeIf(m -> m % n == 0);
        Collections.reverse(input);

        input.forEach(num -> System.out.print(num + " "));

    }
}
