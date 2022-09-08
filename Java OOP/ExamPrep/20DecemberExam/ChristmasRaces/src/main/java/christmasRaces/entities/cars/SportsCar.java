package christmasRaces.entities.cars;

public class SportsCar extends BaseCar{

    private static int SPORTS_CAR_CUBIC_CENTIMETERS = 3000;

    public SportsCar(String model, int horsePower) {
        super(model, horsePower, SPORTS_CAR_CUBIC_CENTIMETERS);
    }
}
