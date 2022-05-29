import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CitiesByContinentsAndCountries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> continents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split(" ");
            String continent = tokens[0];
            String country = tokens[1];
            String town = tokens[2];

            if(!continents.containsKey(continent)){
                continents.put(continent, new LinkedHashMap<>());
                continents.get(continent).put(country, new ArrayList<>());
            } else{
                if(!continents.get(continent).containsKey(country)){
                    continents.get(continent).put(country, new ArrayList<>());
                }
            }
            continents.get(continent).get(country).add(town);
        }

        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : continents.entrySet()) {
            System.out.println(entry.getKey() + ":");

            for (Map.Entry<String, ArrayList<String>> listEntry : entry.getValue().entrySet()) {
                System.out.println(listEntry.getKey() + " -> " + String.join(", ", listEntry.getValue()));
            }

        }


    }
}
