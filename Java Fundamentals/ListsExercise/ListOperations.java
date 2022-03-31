import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            switch (command) {

                case "Add":
                    int toAdd = Integer.parseInt(tokens[1]);
                    nums.add(toAdd);
                    break;

                case "Insert":
                    int numberAdd = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);

                    if (index < 0 || index >= nums.size()) {
                        System.out.println("Invalid index");
                    } else {
                        nums.add(index, numberAdd);
                    }
                    break;

                case "Remove":
                    index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index >= nums.size()) {
                        System.out.println("Invalid index");
                    } else{
                        nums.remove(index);
                    }

                    break;



                case "Shift":
                    if(tokens[1].equals("left")){
                        int count = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < count; i++) {
                            nums.add(nums.get(0));
                            nums.remove(0);
                        }
                    } else{
                        int counter = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < counter; i++) {
                            nums.add(0, nums.get(nums.size() - 1));
                            nums.remove(nums.size() - 1);
                        }

                    }

                    break;
            }

            input = scanner.nextLine();
        }

        for (var item: nums) {
            System.out.print(item + " ");
        }
    }
}
