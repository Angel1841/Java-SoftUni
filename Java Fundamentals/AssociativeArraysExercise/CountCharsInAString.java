import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Map<Character, Integer> symbols = new LinkedHashMap<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {

                char letter = word.charAt(i);

                if(!symbols.containsKey(letter)){
                    symbols.put(letter, 1);
                } else{
                    symbols.put(letter, symbols.get(letter) + 1);
                }
            }
        }
            symbols.forEach((key, value) -> System.out.printf("%c -> %d%n",key,value));
    }
}
