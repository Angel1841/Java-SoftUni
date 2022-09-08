package catHouse.entities.cat;

public class ShorthairCat extends BaseCat {
    private static int SHORT_HAIR_CAT_KG = 7;

    public ShorthairCat(String name, String breed, double price) {
        super(name, breed, price);
        setKilograms(SHORT_HAIR_CAT_KG);
    }

    public void eating(){
        setKilograms(getKilograms() + 1);
    }

}
