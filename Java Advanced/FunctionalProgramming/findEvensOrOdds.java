import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class findEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split(" ");

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        String type = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            numbers.add(i);
        }

        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<Integer> odd = n -> n % 2 != 0;

        if(type.equals("even")){
            System.out.println(numbers.stream().filter(even).map(String::valueOf).collect(Collectors.joining(" ")));
        } else if(type.equals("odd")){
            System.out.println(numbers.stream().filter(odd).map(String::valueOf).collect(Collectors.joining(" ")));
        }

    }
}
