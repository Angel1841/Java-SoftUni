import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).map(String::toString).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("Craft!")){

            String[] tokens = input.split(" - ");

            String command = tokens[0];

            switch (command){
                case "Collect":
                    if(!items.contains(tokens[1])){
                        items.add(tokens[1]);
                    }
                    break;

                case "Drop":
                    items.removeIf(item -> item.equals(tokens[1]));
                    break;

                case "Combine Items":
                    String[] stuff = tokens[1].split(":");

                    String oldWeapon = stuff[0];
                    String newWeapon = stuff[1];

                    int index = items.indexOf(oldWeapon);

                    if(items.contains(oldWeapon)){
                        items.add(index + 1, newWeapon);
                    }
                    break;

                case "Renew":
                    if(items.contains(tokens[1])){
                        items.remove(tokens[1]);
                        items.add(tokens[1]);
                    }
            }



            input = scanner.nextLine();
        }

            System.out.print(String.join(", ",items));
    }
}
