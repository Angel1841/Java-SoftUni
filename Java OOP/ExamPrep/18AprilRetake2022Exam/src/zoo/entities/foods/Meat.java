package zoo.entities.foods;

public class Meat extends BaseFood{

    private static int MEAT_CALORIES = 50;
    private static int MEAT_PRICE = 5;

    public Meat() {
        super(MEAT_CALORIES, MEAT_PRICE);
    }

    @Override
    public int getCalories() {
        return MEAT_CALORIES;
    }

    @Override
    public double getPrice() {
        return MEAT_PRICE;
    }
}
