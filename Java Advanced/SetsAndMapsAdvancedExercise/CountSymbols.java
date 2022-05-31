import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Character, Integer> symbols = new TreeMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);

            if(!symbols.containsKey(letter)){
                symbols.put(letter, 0);
            }
            symbols.put(letter, symbols.get(letter) + 1);
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n",entry.getKey(),entry.getValue());
        }

    }
}
