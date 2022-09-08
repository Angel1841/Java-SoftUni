package christmasRaces.entities.cars;

public class MuscleCar extends BaseCar{

    private static int MUSCLE_CAR_CUBIC_CENTIMETERS = 5000;

    public MuscleCar(String model, int horsePower) {
        super(model, horsePower, MUSCLE_CAR_CUBIC_CENTIMETERS);
    }

}
