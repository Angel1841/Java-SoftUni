package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<String> {

    public Object getRandomElement(){
        int rnd = new Random().nextInt(super.size());
        return super.remove(rnd);
    }

}
