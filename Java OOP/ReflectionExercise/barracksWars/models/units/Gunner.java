package barracksWars.models.units;

public class Gunner extends AbstractUnit {

    private static final int GUNNER_HEALTH_AND_DAMAGE = 20;

    public Gunner() {
        super(GUNNER_HEALTH_AND_DAMAGE, GUNNER_HEALTH_AND_DAMAGE);
    }
}
