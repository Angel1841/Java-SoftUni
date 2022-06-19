import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findMin = list -> {
          int min = Integer.MAX_VALUE;
          int minIndex = -1;

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) <= min){
                    min = list.get(i);
                    minIndex = i;
                }
            }

            return minIndex;
        };

        System.out.println(findMin.apply(nums));

    }
}
