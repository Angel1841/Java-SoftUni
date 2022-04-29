import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plants = new LinkedHashMap<>();
        Map<String, List<Double>> rating = new LinkedHashMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i < n; i++) {

            String[] tokens = input.split("<->");

            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);

            plants.put(plant, rarity);
            rating.putIfAbsent(plant, new ArrayList<>());

            input = scanner.nextLine();
        }

        while(!input.equals("Exhibition")){

            String[] commands = input.split(": ");

            String command = commands[0];

            String[] plantsFeatures = commands[1].split(" - ");


            if (!plants.containsKey(plantsFeatures[0])) {
                System.out.println("error");
                continue;
            }

            switch(command){
                case"Rate":
                    double ratings = Double.parseDouble(plantsFeatures[1]);
                    rating.get(plantsFeatures[0]).add(ratings);
                    break;

                case"Update":
                    int updatedRarity = Integer.parseInt(plantsFeatures[1]);
                    plants.put(plantsFeatures[0],updatedRarity);
                    break;

                case"Reset":
                    rating.get(plantsFeatures[0]).clear();
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        plants.entrySet().stream().forEach(entry -> System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f",
                        entry.getKey(), entry.getValue(),
                        rating.get(entry.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0))));

    }
}
