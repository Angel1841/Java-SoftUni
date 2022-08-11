package vehicles;

public class Car extends Vehicles{

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public String driving(double distance) {
        double consumption = distance * (getFuelConsumption() + 0.9);
        return travelling(distance, consumption);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters);
    }

}
