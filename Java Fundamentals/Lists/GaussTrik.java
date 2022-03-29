import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> output = new ArrayList<>();

        for (int j = 1; j <= nums.size() - 2; j++) {
            for (int i = 0; i < nums.size() - j; i++) {

                nums.set(i,nums.get(i)+nums.get(nums.size() - j));

                nums.remove(nums.size() - j);

            }
        }

        for (var item: nums) {
            System.out.print(item + " ");
        }

    }
}