package CardSuit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command){
            case "Card Suits":
                System.out.println("Card Suits:");
            Arrays.stream(CardSuits.values()).forEach(e -> System.out.printf("Ordinal value: %d; Name value: %s%n", e.ordinal(), e.name()));
            break;

            case "Card Ranks":
                System.out.println("Card Ranks:");
                Arrays.stream(CardRank.values()).forEach(e -> System.out.printf("Ordinal value: %d; Name value: %s%n", e.ordinal(), e.name()));
                break;
        }



    }
}
