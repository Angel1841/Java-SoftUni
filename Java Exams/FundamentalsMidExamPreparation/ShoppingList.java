import java.util.*;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("!")).map(String::toString).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {

            String[] tokens = input.split(" ");

            String command = tokens[0];

            switch (command) {
                case "Urgent":
                    if(!list.contains(tokens[1])){
                        list.add(0,tokens[1]);
                    }
                break;

                case "Unnecessary":
                    list.removeIf(food -> food.equals(tokens[1]));
                break;

                case "Correct":
                    String fruit = tokens[1];
                    String swappable = tokens[2];

                    if(list.contains(fruit)){

                        int index = list.indexOf(fruit);
                        list.set(index,swappable);
                        list.remove(fruit);

                    }
                break;

                case "Rearrange":
                    String toMatch = tokens[1];

                    if(list.contains(toMatch)){
                        list.remove(toMatch);
                        list.add(toMatch);
                    }
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ",list));

    }

}
