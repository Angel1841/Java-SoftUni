package zoo.entities.foods;

public abstract class BaseFood implements Food {

    private int calories;
    private double price;

    public BaseFood(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }


}
