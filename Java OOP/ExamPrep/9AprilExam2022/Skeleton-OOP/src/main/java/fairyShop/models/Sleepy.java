package fairyShop.models;

public class Sleepy extends BaseHelper{

    private static int SLEEPY_ENERGY = 50;

    public Sleepy(String name) {
        super(name, SLEEPY_ENERGY);
        setWorkEnergy(15);
    }

}
