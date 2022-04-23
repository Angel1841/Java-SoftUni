import java.util.*;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(tokens[2]);
                    int index = Integer.parseInt(tokens[1]);

                    if (index > targets.size() - 1) {
                        System.out.println("Invalid placement");
                    } else {
                        if (targets.get(index) - power > 0) {
                            targets.set(index, targets.get(index) - power);
                        }else if(targets.get(index) - power <= 0){
                            targets.remove(index);
                        }
                    }
                break;

                case "Add":
                    int value = Integer.parseInt(tokens[2]);
                    int index1 = Integer.parseInt(tokens[1]);

                    if(index1 > targets.size() - 1){
                        System.out.println("Invalid placement!");
                    } else{
                        targets.add(index1,value);
                    }
                    break;

                case "Strike":
                    int radius = Integer.parseInt(tokens[2]);
                    int index2 = Integer.parseInt(tokens[1]);


                        if (index2 + radius < targets.size() && index2 - radius >= 0) {
                            targets.subList(index2 - radius, index2 + radius + 1).clear();
                        } else {
                            System.out.println("Strike missed!");
                        }

            }

            input = scanner.nextLine();
        }

        System.out.println(Delimiter(targets));

    }

    public static String Delimiter(List<Integer> list){

        StringJoiner joiner = new StringJoiner("|");
        list.forEach(item -> joiner.add(item.toString()));
        return joiner.toString();

    }
}
