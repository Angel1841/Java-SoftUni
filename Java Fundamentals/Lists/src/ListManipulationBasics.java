import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());



    while(true){

        String input = scanner.nextLine();

        if(input.equals("end")){
            break;
        }

        String[] tokens = input.split(" ");


        switch(tokens[0]){
            case "Add":
                int numToAdd = Integer.parseInt(tokens[1]);
                nums.add(numToAdd);
                break;

            case "Remove":
                int numToRemove = Integer.parseInt(tokens[1]);
                nums.remove(Integer.valueOf(numToRemove));
                break;

            case "RemoveAt":
                int index = Integer.parseInt(tokens[1]);
                nums.remove(index);
                break;

            case "Insert":
                int insertedNum = Integer.parseInt(tokens[1]);
                int givenIndex = Integer.parseInt(tokens[2]);
                nums.add(givenIndex,insertedNum);
                break;
        }

    }

        for (var item:nums) {
            System.out.print(item + " ");
        }

    }
}
