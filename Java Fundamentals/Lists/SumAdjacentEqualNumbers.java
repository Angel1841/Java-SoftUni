import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < nums.size() - 1; i++) {
            if(nums.get(i).equals(nums.get(i+1))){
                nums.set(i,nums.get(i) + nums.get(i+1));
                nums.remove(i+1);
                i = -1;
            }
        }

        for (var item:nums) {
            if(item % 1 == 0){
                System.out.printf("%.0f",item);
                System.out.print(" ");
            } else{
                System.out.print(item + " ");
            }

        }

    }
}
