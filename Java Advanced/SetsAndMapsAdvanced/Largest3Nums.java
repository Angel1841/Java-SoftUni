import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        nums.forEach(s -> System.out.print(s + " "));
    }
}
