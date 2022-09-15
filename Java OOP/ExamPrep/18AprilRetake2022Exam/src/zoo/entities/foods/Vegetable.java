package zoo.entities.foods;

public class Vegetable extends BaseFood{

    private static int VEGETABLE_CALORIES = 50;
    private static int VEGETABLE_PRICE = 5;

    public Vegetable() {
        super(VEGETABLE_CALORIES, VEGETABLE_PRICE);
    }

    @Override
    public int getCalories() {
        return VEGETABLE_CALORIES;
    }

    @Override
    public double getPrice() {
        return VEGETABLE_PRICE;
    }
}
