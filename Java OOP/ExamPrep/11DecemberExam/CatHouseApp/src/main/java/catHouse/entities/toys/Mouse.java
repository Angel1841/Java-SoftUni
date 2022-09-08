package catHouse.entities.toys;

public class Mouse extends BaseToy{

    private static int SOFTNESS_MOUSE = 5;
    private static double PRICE_MOUSE = 15;

    public Mouse() {
        super(SOFTNESS_MOUSE, PRICE_MOUSE);
    }
}
