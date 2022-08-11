package vehicles;

import java.text.DecimalFormat;

public abstract class Vehicles {

    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicles(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract String driving(double distance);
    public abstract void refuel(double liters);

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String travelling(double distance, double consumption){
        DecimalFormat format = new DecimalFormat( "#.##" );
        if(consumption <= getFuelQuantity()){
            setFuelQuantity(getFuelQuantity() - consumption);
            return String.format("%s travelled %s km", getClass().getSimpleName(), format.format(distance));
        }

        return String.format("%s needs refueling", getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), getFuelQuantity());
    }
}
