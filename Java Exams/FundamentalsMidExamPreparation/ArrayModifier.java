import java.util.*;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "swap":
                    int firstIndex = Integer.parseInt(data[1]);
                    int secondIndex = Integer.parseInt(data[2]);

                    Collections.swap(nums, firstIndex,secondIndex);
                    break;

                case "multiply":
                    int firstNum = Integer.parseInt(data[1]);
                    int secondNum = Integer.parseInt(data[2]);

                    nums.set(firstNum,nums.get(firstNum) * nums.get(secondNum));
                break;

                case "decrease":
                    for (int i = 0; i < nums.size(); i++) {
                        nums.set(i,nums.get(i) - 1);
                    }
                    break;

            }
            input = scanner.nextLine();
        }

        System.out.println(Delimiter(nums));

    }

    public static String Delimiter(List<Integer> list){

        StringJoiner joiner = new StringJoiner(", ");
        list.forEach(item -> joiner.add(item.toString()));
        return joiner.toString();

    }

}
