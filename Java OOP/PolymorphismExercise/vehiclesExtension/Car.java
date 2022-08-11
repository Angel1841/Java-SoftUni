package vehiclesExtension;

public class Car extends Vehicles {

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String driving(double distance) {
        double fuelConsumption = distance * (getFuelConsumption() + 0.9);
        return traveling(fuelConsumption, distance);
    }

    @Override
    public void refueling(double liters) {
        checkFuelLitters(liters);
        checkTankOverloading(liters);
        setFuelQuantity(getFuelQuantity() + liters);
    }
}
