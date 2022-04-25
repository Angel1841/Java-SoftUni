import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> output = new ArrayList<>();

        int average = 0;
        int sum = 0;

        // cikul za average
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        average = sum / nums.size();


        for (var el: nums) {
            if(el * 1.00 > average){
                output.add(el);
            }
        }

        Collections.sort(output);
        Collections.reverse(output);

        if (output.size() >= 5){
            for (int i = 0; i < 5; i++) {
                System.out.print(output.get(i) + " ");
            }
        } else{
            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i) + " ");
            }
        }

        if(output.isEmpty()){
            System.out.println("No");
        }

    }

}
