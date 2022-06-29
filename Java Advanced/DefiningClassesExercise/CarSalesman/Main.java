package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split(" ");

            Engine engine = null;
            String model = tokens[0];
            String power = tokens[1];
            String displacement = "n/a";
            String efficiency = "n/a";

            //creating the engines
            switch (tokens.length){
                case 2:

                    engine = new Engine(model, power,displacement,efficiency);

                    break;

                case 3:

                    if(Character.isDigit(tokens[2].charAt(0))){
                        displacement = tokens[2];
                    } else{
                        efficiency = tokens[2];
                    }

                    engine = new Engine(model, power, displacement, efficiency);

                    break;

                case 4:

                    displacement = tokens[2];
                    efficiency = tokens[3];

                    engine = new Engine(model, power, displacement, efficiency);
                    break;
            }
            engines.put(model, engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while(m --> 0){
            String[] input = scanner.nextLine().split("\\s+");

            String model = input[0];
            Engine engine = engines.get(input[1]);
            String weight = "n/a";
            String color = "n/a";

            Car car = null;
            //creating the Car
            switch(input.length){
                case 2:
                    car = new Car(model, engine, weight, color);
                    break;

                case 3:
                    if(Character.isDigit(input[2].charAt(0))){
                        weight = input[2];
                    } else{
                        color = input[2];
                    }
                    car = new Car(model, engine, weight, color);
                break;

                case 4:
                    weight = input[2];
                    color = input[3];
                    car = new Car(model, engine, weight, color);
                    break;
            }
            cars.add(car);
        }

        cars.forEach(System.out::println);


    }
}
