import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (Double num: nums) {
            if(counts.containsKey(num)){
                int currentNum = counts.get(num);
                counts.put(num, currentNum + 1);
            } else{
                counts.put(num, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.0f -> %d\n",entry.getKey(),entry.getValue());
        }

    }
}
