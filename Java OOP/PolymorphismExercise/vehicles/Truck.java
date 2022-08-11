
package vehicles;

public class Truck extends Vehicles {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public String driving(double distance) {
        double consumption = distance * (getFuelConsumption() + 1.6);
        return travelling(distance, consumption);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters * 0.95);
    }
}
