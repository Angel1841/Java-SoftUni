import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, String> size = l -> "Count = " + l.size();

        String countOutput = size.apply(nums);

        Function<List<Integer>, Integer> sum = l -> l.stream().mapToInt(e -> e).sum();

        int sumOutput = sum.apply(nums);

        System.out.printf("%s%nSum = %d",countOutput,sumOutput);

    }
}
