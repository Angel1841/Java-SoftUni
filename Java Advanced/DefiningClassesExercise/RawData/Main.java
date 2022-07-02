package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < countOfCars; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < tokens.length; j += 2) {
                double tire1Pressure = Double.parseDouble(tokens[j]);
                int tire1Age = Integer.parseInt(tokens[j + 1]);
                Tire tire = new Tire(tire1Pressure, tire1Age);
                tires.add(tire);
            }

            Car car = new Car(model,engine,cargo,tires);
            cars.add(car);
        }

        String cargoType = scanner.nextLine();

        if(cargoType.equals("fragile")){
            cars.stream()
                    .filter(c -> c.getCargo().getType().equals("fragile"))
                    .filter(c -> c.getTires().stream().anyMatch(t -> t.getPressure() < 1))
                    .forEach(c -> System.out.println(c.getModel()));
        } else {
            cars.stream()
                    .filter(c -> c.getCargo().getType().equals("flamable"))
                    .filter(c -> c.getEngine().getPower() > 250)
                    .forEach(c -> System.out.println(c.getModel()));
        }


    }
}
