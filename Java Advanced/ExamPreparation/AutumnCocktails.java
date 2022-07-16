import java.util.*;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> coctails = new TreeMap<>();

        coctails.put("Apple Hinny", 0);
        coctails.put("High Fashion", 0);
        coctails.put("Pear Sour", 0);
        coctails.put("The Harvest", 0);

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        ArrayDeque<Integer> freshness = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(ingredients::offer);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(freshness::push);

        while(!ingredients.isEmpty() && !freshness.isEmpty()){

            int ingredient = ingredients.poll();

            if(ingredient == 0){
                continue;
            }

            int sum = freshness.pop() * ingredient;

            String coctail;

            switch(sum){
                case 150:
                    coctail = "Pear Sour";
                    break;
                case 250:
                    coctail = "The Harvest";
                    break;
                case 300:
                    coctail = "Apple Hinny";
                    break;
                case 400:
                    coctail = "High Fashion";
                    break;
                default:
                    coctail = null;
                    break;
            }

            if(coctail != null){
                coctails.put(coctail, coctails.get(coctail) + 1);
            } else {
                ingredients.offer(ingredient + 5);
            }

        }

        if(coctails.entrySet().stream().filter(c -> c.getValue() > 0).count() >= 4){
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        if(!ingredients.isEmpty()){
            System.out.println("Ingredients left: " + ingredients.stream().mapToInt(Integer::valueOf).sum());
        }

        coctails.entrySet().stream().filter(c -> c.getValue() > 0).forEach(c -> System.out.printf(" # %s --> %d%n", c.getKey(), c.getValue()));

    }
}
