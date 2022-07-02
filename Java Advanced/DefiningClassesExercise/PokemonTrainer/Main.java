package PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while(!input.equals("Tournament")){

            String[] tokens = input.split(" ");

            String trainerName = tokens[0];
            String pokeName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokeName, element, health);


            trainers.putIfAbsent(trainerName, new Trainer(trainerName, new ArrayList<>()));


           trainers.get(trainerName).getPokemons().add(pokemon);

            input = scanner.nextLine();
        }

        String givenElement = scanner.nextLine();

        while(!givenElement.equals("End")){

            for (Map.Entry<String, Trainer> entry : trainers.entrySet()) {
                if(!entry.getValue().getPokemons().isEmpty() && entry.getValue().hasElement(givenElement)){
                    entry.getValue().recieveBadge();
                } else {
                   entry.getValue().takeDmg();
                }
            }

            givenElement = scanner.nextLine();
        }

        Map<String, Trainer> sortedTrainers = new LinkedHashMap<>();

        trainers.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((Comparator.comparingInt(Trainer::getBadges)).reversed()))
                .forEach(e -> sortedTrainers.put(e.getKey(),e.getValue()));

        if (!sortedTrainers.isEmpty()) {
            sortedTrainers.forEach((key, value) -> System.out.println(key + " " + value.getBadges() + " " + value.getPokemons().size()));
        }

    }
}
