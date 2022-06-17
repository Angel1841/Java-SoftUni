import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> getMin = (int[] arr) -> {

            int min = Integer.MAX_VALUE;

            for (int num: arr) {
                if(num < min){
                    min = num;
                }
            }
            return min;
        };

        System.out.println(getMin.apply(numbers));


    }

    private static Integer min(int [] arr){
        int min = Integer.MAX_VALUE;

        for (var num: arr) {
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
