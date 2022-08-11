package vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split(" ");

        double carFuelQuantity = Double.parseDouble(carInput[1]);
        double carLitersPerKm = Double.parseDouble(carInput[2]);

        Car car = new Car(carFuelQuantity, carLitersPerKm);

        String[] truckInput = scanner.nextLine().split(" ");

        double truckFuelQuantity = Double.parseDouble(truckInput[1]);
        double truckLitersPerKm = Double.parseDouble(truckInput[2]);

        Truck truck = new Truck(truckFuelQuantity, truckLitersPerKm);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(" ");

            String action = commands[0];

            switch (action){
                case"Drive":
                        if("Car".equals(commands[1])){
                            System.out.println(car.driving(Double.parseDouble(commands[2])));
                        } else {
                            System.out.println(truck.driving(Double.parseDouble(commands[2])));
                        }
                    break;

                case"Refuel":
                    if("Car".equals(commands[1])){
                        car.refuel(Double.parseDouble(commands[2]));
                    } else {
                        truck.refuel(Double.parseDouble(commands[2]));
                    }

                    break;

            }
        }

        System.out.printf("%s%n%s", car.toString(), truck.toString());

    }
}
