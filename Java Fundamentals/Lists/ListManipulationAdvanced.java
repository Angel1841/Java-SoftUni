import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while(true){

            String input = scanner.nextLine();

            if(input.equals("end")){
                break;
            }

            String[] tokens = input.split(" ");

            if(tokens[0].equals("Get") && tokens[1].equals("sum")){
                int sum = 0;
                for (var i: nums) {
                    sum += i;
                }
                System.out.println(sum);
            }



            switch(tokens[0]) {
                case "Contains":
                    int number = Integer.parseInt(tokens[1]);
                    if (nums.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    String line = tokens[1];

                    if (line.equals("even")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) % 2 == 0) {
                                System.out.print(nums.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }

                    if (line.equals("odd")) {
                        String temp = "";
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) % 2 != 0) {
                                temp += nums.get(i);
                                temp += " ";
                            }
                        }
                        System.out.println(temp);
                    }

                    break;


                case "Filter":
                    int border = Integer.parseInt(tokens[2]);


                    if (tokens[1].equals("<")) {
                        for (var item : nums) {
                            if (item < border) {
                                System.out.print(item + " ");
                            }
                        }
                    }

                    if (tokens[1].equals(">")) {
                        for (var item : nums) {
                            if (item > border) {
                                System.out.print(item + " ");
                            }
                        }
                    }
                        if (tokens[1].equals(">=")) {
                            for (var item : nums) {
                                if (item >= border) {
                                    System.out.print(item + " ");
                                }
                            }

                        }
                        if (tokens[1].equals("<=")) {
                            for (var item : nums) {
                                if (item <= border) {
                                    System.out.print(item + " ");
                                }
                            }
                        }

                        System.out.println();

                        break;

            }
        }

    }

}
