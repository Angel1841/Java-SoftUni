import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        LinkedHashMap<Double, Integer> nums = new LinkedHashMap<>();

        for (double num : input) {
            if(!nums.containsKey(num)){
                nums.put(num, 1);
            } else{
                nums.put(num, nums.get(num) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : nums.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
