package GenericArrayCreator;


public class Main {
    public static void main(String[] args) {
        Integer[] arr = ArrayCreator.create(12, 69);

        Integer[] arr2 = ArrayCreator.create(4, 8);

        for (Integer integer: arr) {
            System.out.println(integer);
        }

        for (Integer integer: arr2) {
            System.out.println(integer);
        }
    }
}
