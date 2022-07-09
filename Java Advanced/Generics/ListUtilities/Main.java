package ListUtilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(23, 42, 79, 12);

        ListUtils.getMax(list);
        ListUtils.getMin(list);

    }
}
