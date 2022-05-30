import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Double>> list = new TreeMap<>();

        while(!input.equals("Revision")){

            String[] tokens = input.split(", ");

            String name = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            if(!list.containsKey(name)){
                list.put(name, new LinkedHashMap<>());
                list.get(name).put(product, price);
            } else{
                list.get(name).put(product, price);
            }



            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : list.entrySet()) {
            System.out.println(entry.getKey() + "->");

            for (Map.Entry<String, Double> doubleEntry : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, ",doubleEntry.getKey());
                System.out.printf("Price: %.1f%n",doubleEntry.getValue());
            }


        }


    }
}
