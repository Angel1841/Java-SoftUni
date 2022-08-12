package vehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicles {

    private double fuelQuantity;
    private double fuelConsumption; //in liters per km
    private double tankCapacity;

    public Vehicles(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public abstract String driving(double distance);

    public abstract void refueling(double liters);

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        checkFuelLitters(fuelQuantity);
        this.fuelQuantity = fuelQuantity;
    }

    public void checkFuelLitters(double liters) {
        if(liters <= 0) {
            throw new IllegalArgumentException(Messages.INVALID_FUEL_LITTERS);
        }
    }

    public void checkTankOverloading(double liters) {
        if(getFuelQuantity() + liters > getTankCapacity()) {
            throw new IllegalArgumentException(Messages.FUEL_OVERLOADING);
        }
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String traveling(double fuelConsumption, double distance){
        DecimalFormat format = new DecimalFormat( "#.##" );
        if(fuelConsumption <= getFuelQuantity()){
            setFuelQuantity(getFuelQuantity() - fuelConsumption);
            return String.format(Messages.TRAVELING, getClass().getSimpleName(), format.format(distance));
        }
        return String.format(Messages.NOT_TRAVELING, getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuelQuantity());
    }
}
