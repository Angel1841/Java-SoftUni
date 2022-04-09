import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> products = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("buy")){

            String[] data = input.split("\\s+");

            String name = data[0];
            Double price = Double.parseDouble(data[1]);
            Double quantity = Double.parseDouble(data[2]);

            if(products.containsKey(name)){
                products.get(name).set(0,price);
                products.get(name).set(1, products.get(name).get(1) + quantity);
            } else{
                products.put(name,new ArrayList<>());
                products.get(name).add(price);
                products.get(name).add(quantity);
            }

            input = scanner.nextLine();
        }

        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n",k, v.get(0) * v.get(1)));


    }
}
