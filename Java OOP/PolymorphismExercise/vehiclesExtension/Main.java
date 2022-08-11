package vehiclesExtension;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Car car = null;
    public static Truck truck = null;
    public static Bus bus = null;
    public static String[] attributes = null;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            try {
                getVehicle(console);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int numberOfLines = Integer.parseInt(console.nextLine());

        while (numberOfLines-- > 0) {
            executeCommand(console);
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static void getVehicle(Scanner console) {
        attributes = console.nextLine().split("\\s+");

        switch (attributes[0]) {
            case "Car":
                car = new Car(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]), Double.parseDouble(attributes[3]));
                break;
            case "Truck":
                truck = new Truck(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]), Double.parseDouble(attributes[3]));
                break;
            case "Bus":
                bus = new Bus(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]), Double.parseDouble(attributes[3]));
                break;
        }
    }

    private static void executeCommand(Scanner console) {
        String[] commandAttribute = console.nextLine().split("\\s+");
        String command = commandAttribute[0];
        double argument = Double.parseDouble(commandAttribute[2]);
        Vehicles vehicle = getVehicleType(commandAttribute[1]);
        try {

            switch (command) {
                case "Drive":
                    System.out.println(Objects.requireNonNull(vehicle).driving(argument));
                    break;
                case "DriveEmpty":
                    System.out.println(bus.drivingEmpty(argument));
                    break;
                case "Refuel":
                    Objects.requireNonNull(vehicle).refueling(argument);
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Vehicles getVehicleType(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                return car;
            case "Truck":
                return truck;
            case "Bus":
                return bus;
            default:
                return null;
        }
    }
}