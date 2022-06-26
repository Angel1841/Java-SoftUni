import java.util.*;

public class ItsChocolateTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> chocalates = new TreeMap<>();

        chocalates.put("Milk Chocolate", 0);
        chocalates.put("Dark Chocolate", 0);
        chocalates.put("Baking Chocolate", 0);

        ArrayDeque<Double> milk = new ArrayDeque<>();
        ArrayDeque<Double> cacao = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .forEach(milk::offer);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .forEach(cacao::push);


        while(!milk.isEmpty() && !cacao.isEmpty()){

            double currentMilk = milk.poll();

            double currentCacao = cacao.pop();

            double percentage = currentCacao / (currentCacao + currentMilk);

            percentage *= 100;

            String drink;

            if(percentage == 30){
                drink = "Milk Chocolate";
            } else if(percentage == 50){
                drink = "Dark Chocolate";
            } else if (percentage == 100){
                drink = "Baking Chocolate";
            } else {
                drink = null;
            }

            if(drink != null){
                chocalates.put(drink, chocalates.get(drink) + 1);
            } else {
                milk.offer(currentMilk + 10.0);
            }


        }

        if(chocalates.entrySet().stream().filter(c -> c.getValue() > 0).count() >= 3){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        chocalates.entrySet().stream().filter(c -> c.getValue() > 0).forEach(c -> System.out.printf("# %s --> %d%n", c.getKey(), c.getValue()));


    }
}
