import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> IsUpper = w -> Character.isUpperCase(w.charAt(0));

        List<String> uppercase = Arrays.stream(scanner.nextLine().split(" "))
                .filter(IsUpper)
                .collect(Collectors.toList());

        System.out.println(uppercase.size());

        Consumer<String> output = System.out::println;

        uppercase.forEach(output);



    }
}
