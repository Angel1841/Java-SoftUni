package ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static boolean catchException = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        Map<String, List<String>> bought = new LinkedHashMap<>();

        String[] inputPeople = scanner.nextLine().split(";");

        Arrays.stream(inputPeople).forEach(p -> {
            String[] tokens = p.split("=");

            String name = tokens[0];
            int money = Integer.parseInt(tokens[1]);

            try{
                Person person = new Person(name, money);
                people.putIfAbsent(name, person);
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                catchException = true;
            }
        });

        if(catchException) {
            return;
        }

        String[] inputProducts = scanner.nextLine().split(";");

        Arrays.stream(inputProducts).forEach(p -> {

            String[] tokens = p.split("=");

            String name = tokens[0];
            int price = Integer.parseInt(tokens[1]);

            try{
                Product product = new Product(name, price);
                products.putIfAbsent(name, product);
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                catchException = true;
            }
        });

        if(catchException) {
            return;
        }

        String command = scanner.nextLine();

        while(!command.equals("END")){

            String[] input = command.split(" ");

            String name = input[0];
            String product = input[1];

            bought.putIfAbsent(name, new ArrayList<>());

            canAfford(name, product, people, products, bought);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : bought.entrySet()) {

            System.out.print(entry.getKey() + " - ");

            if(!entry.getValue().isEmpty()){
                System.out.print(entry.getValue().stream().map(String::valueOf).collect(Collectors.joining(", ")));
                System.out.println();
            } else {
                System.out.println("Nothing bought");
            }

        }

    }

    private static void canAfford(String name, String product,  Map<String, Person> people, Map<String, Product> products,  Map<String, List<String>> bought) {
        if(people.get(name).getMoney() - products.get(product).getCost() >= 0){

            people.get(name).buyProduct(products.get(product));

            bought.get(name).add(product);

            System.out.printf("%s bought %s%n",name, product);
        } else {
            System.out.printf("%s can't afford %s%n",name, product);
        }
    }
}
