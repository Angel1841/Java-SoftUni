package fairyShop.models;

import java.util.Collection;

public class Happy extends BaseHelper{

    private static final int HAPPY_ENERGY = 100;

    public Happy(String name) {
        super(name, HAPPY_ENERGY);
        setWorkEnergy(10);
    }



}
