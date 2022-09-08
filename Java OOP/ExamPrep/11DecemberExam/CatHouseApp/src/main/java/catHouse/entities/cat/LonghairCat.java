package catHouse.entities.cat;

public class LonghairCat extends BaseCat{

    private static int LONG_HAIR_CAT_KG = 9;

    public LonghairCat(String name, String breed, double price) {
        super(name, breed, price);
        setKilograms(LONG_HAIR_CAT_KG);
    }

    @Override
    public void eating(){
        setKilograms(getKilograms() + 3);
    }
}
