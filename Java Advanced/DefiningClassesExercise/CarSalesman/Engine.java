package CarSalesman;

public class Engine {

    String model;
    String power;
    String displacement;
    String efficiency;

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s", this.model, this.power, this.displacement, this.efficiency);
    }
}

