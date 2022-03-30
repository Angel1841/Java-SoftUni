import java.util.*;
import java.util.stream.Collectors;

public class RemovingNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        nums.removeIf(x -> x < 0);
        Collections.reverse(nums);

        if(nums.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println(nums.toString().replaceAll("[\\[\\],]",""));
        }



    }
}
