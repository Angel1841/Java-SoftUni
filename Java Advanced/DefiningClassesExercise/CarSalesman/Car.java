package CarSalesman;

public class Car {

    String model;
    Engine engine;
    String weight;
    String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n%s%nWeight: %s%nColor: %s", this.model, engine.toString(), this.weight, this.color);
    }
}
