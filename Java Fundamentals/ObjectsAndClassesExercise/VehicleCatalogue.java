import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {

    static double avgHp(List<Vehicle> list){
        if(list.size() == 0){
            return 0;
        }
        return list.stream().mapToDouble(Vehicle::getHorsepower).sum() / list.size();
    }


    static class Vehicle{

        private String type;
        private String model;
        private String color;
        private int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public double getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %s",getType().toUpperCase().charAt(0) + getType().substring(1),this.model,this.color,this.horsepower);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.equals("End")){

            String tokens[] = input.split(" ");

            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);

            Vehicle vehicle = new Vehicle(type, model, color,horsepower);

            vehicles.add(vehicle);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while(!input.equals("Close the Catalogue")){

            String type = input;

            vehicles.stream().filter(v -> v.getModel().equals(type))
                    .forEach(v -> System.out.println(v.toString()));

            input = scanner.nextLine();
        }

        List<Vehicle> cars = vehicles.stream()
                .filter(v -> v.getType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> trucks = vehicles.stream()
                .filter(v -> v.getType().equals("truck"))
                .collect(Collectors.toList());

            double averageCar = avgHp(cars);
            double averageTruck = avgHp(trucks);

            System.out.printf("Cars have average horsepower of: %.2f.\n",averageCar);
            System.out.printf("Trucks have average horsepower of: %.2f.\n",averageTruck);
    }
}
