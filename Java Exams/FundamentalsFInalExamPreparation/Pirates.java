import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {

    static class Location {
        private String city;
        private int population;
        private int gold;

        public Location(String city, int population, int gold) {
            this.city = city;
            this.population = population;
            this.gold = gold;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Location> places = new LinkedHashMap<>();

        while (!input.equals("Sail")) {

            String[] tokens = input.split("\\|\\|");

            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            Location location = new Location(city,population,gold);

            if(places.containsKey(city)){
                places.get(city).setGold(places.get(city).getGold() + gold);
                places.get(city).setPopulation(places.get(city).getPopulation() + population);
            }else{
                places.put(city, location);
            }


            input = scanner.nextLine();
        }


        while(!input.equals("End")){

            String[] events = input.split("=>");

            String command = events[0];

            switch (command){
                case"Plunder":

                    String town = events[1];
                    int ppl = Integer.parseInt(events[2]);
                    int money = Integer.parseInt(events[3]);

                    places.get(town).setPopulation(places.get(town).getPopulation() - ppl);
                    places.get(town).setGold(places.get(town).getGold() - money);

                    if( places.get(town).getGold() == 0 || places.get(town).getPopulation() == 0){
                        places.remove(town);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,money,ppl);
                        System.out.printf("%s has been wiped off the map!%n",town);
                    }else{
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,money,ppl);
                    }

                    break;

                case"Prosper":

                    String townName = events[1];
                    int bonusGold = Integer.parseInt(events[2]);

                    if(bonusGold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        places.get(townName).setGold(places.get(townName).getGold() + bonusGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",bonusGold,townName,places.get(townName).getGold());
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        if(places.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else{
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",places.size());
            for (Map.Entry<String, Location> entry : places.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",entry.getKey(),entry.getValue().getPopulation(),entry.getValue().getGold());
            }

        }
    }
}
