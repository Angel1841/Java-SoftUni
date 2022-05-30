import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VoinaNumberGasme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while(rounds > 0){

            int firstCard = getFirst(firstDeck);
            int secondCard = getFirst(secondDeck);

            firstDeck.remove(firstCard);
            secondDeck.remove(secondCard);

            if(firstCard > secondCard){
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if(secondCard > firstCard){
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }

            if(firstDeck.isEmpty() || secondDeck.isEmpty()){
                break;
            }

            rounds--;
        }

        if(firstDeck.size() > secondDeck.size()){
            System.out.println("First player win!");
        }else if(firstDeck.size() < secondDeck.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }


    }

    private static int getFirst(LinkedHashSet<Integer> set) {
        for (Integer card : set) {
            return card;
        }
        return 0;
    }

}
