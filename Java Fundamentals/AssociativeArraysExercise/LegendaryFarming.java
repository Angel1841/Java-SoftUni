import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> crystals = new LinkedHashMap<>();

        String winner = "";

        crystals.put("shards", 0);
        crystals.put("fragments", 0);
        crystals.put("motes", 0);

        boolean hasWinner = false;

        while (!hasWinner) {
            String[] items = scanner.nextLine().split("\\s+");

            for (int i = 0; i < items.length - 1; i+=2) {
                int quantity = Integer.parseInt(items[i]);
                String type = items[i + 1].toLowerCase();

                    crystals.putIfAbsent(type, 0);
                    crystals.put(type, crystals.get(type) + quantity);


                if (type.equals("shards") || type.equals("fragments") || type.equals("motes")) {

                    if (crystals.get(type) >= 250) {

                        crystals.put(type, crystals.get(type) - 250);
                        winner = type;
                        hasWinner = true;



                        break;
                    }

                }


            }

        }

        switch (winner) {

            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;

            case "fragments":
                System.out.println("Valanyr obtained!");
                break;

            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;

        }

        crystals.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));


    }
}
