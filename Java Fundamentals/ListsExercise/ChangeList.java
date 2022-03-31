import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while(true){
            if(input.equals("end")){
                break;
            }

            String[] tokens = input.split(" ");

            switch(tokens[0]){
                case "Delete":
                    int element = Integer.parseInt(tokens[1]);

                    for (int i = 0; i < nums.size(); i++) {
                        if(element == nums.get(i)){
                            nums.remove(i);
                            i--;
                        }
                    }
                    break;

                case "Insert":
                    int num = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    nums.add(index, num);
                    break;
            }

            input = scanner.nextLine();


        }
        for (var item: nums) {
            System.out.print(item + " ");
        }

    }
}
