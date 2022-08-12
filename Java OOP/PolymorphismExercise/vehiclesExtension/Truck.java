
package vehiclesExtension;

public class Truck extends Vehicles {


    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String driving(double distance) {
        double fuelConsumption = distance * (getFuelConsumption() + 1.6);
        return traveling(fuelConsumption, distance);
    }

    @Override
    public void refueling(double liters) {
        checkFuelLitters(liters);
        checkTankOverloading(liters*0.95);
        setFuelQuantity(getFuelQuantity() + liters*0.95);
    }
}
