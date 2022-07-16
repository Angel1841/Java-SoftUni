import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlackSmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int forgedSwords = 0;

        Map<Integer, String> swords = new HashMap<>();

        swords.put(70, "Gladius");
        swords.put(80, "Shamshir");
        swords.put(90, "Katana");
        swords.put(110, "Sabre");

        TreeMap<String, Integer> amountOfSwords = new TreeMap<>();
        amountOfSwords.put("Sabre", 0);
        amountOfSwords.put("Katana", 0);
        amountOfSwords.put("Shamshir", 0);
        amountOfSwords.put("Gladius", 0);

        ArrayDeque<Integer> steel = new ArrayDeque<>();
        ArrayDeque<Integer> carbon = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(steel::offer);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(carbon::push);

        while(!steel.isEmpty() && !carbon.isEmpty()){

            int currentSteel = steel.peek();
            int currentCarbon = carbon.peek();

            int sum = currentCarbon + currentSteel;

            steel.poll();
            carbon.pop();

            if(swords.containsKey(sum)){
                forgedSwords++;
                amountOfSwords.put(swords.get(sum), amountOfSwords.get(swords.get(sum)) + 1);
            } else {
                currentCarbon += 5;
                carbon.push(currentCarbon);
            }

        }

        if(forgedSwords <= 0){
            System.out.println("You did not have enough resources to forge a sword.");
        } else {
            System.out.printf("You have forged %d swords.%n", forgedSwords);
        }

        if(!steel.isEmpty()){
            System.out.print("Steel left: ");

            System.out.println(steel.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        } else {
            System.out.println("Steel left: none");
        }

        if(!carbon.isEmpty()){
            System.out.print("Carbon left: ");

            System.out.println(carbon.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        } else {
            System.out.println("Carbon left: none");
        }

        if(forgedSwords > 0){

            amountOfSwords.entrySet().stream().filter(s -> s.getValue() > 0).forEach(s -> System.out.println(s.getKey() + ": " + s.getValue()));

        }

    }
}
