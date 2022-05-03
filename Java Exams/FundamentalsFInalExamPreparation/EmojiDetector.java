import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern words = Pattern.compile("([*]{2})([A-Z][a-z]{2,})\\1|([:]{2})([A-Z][a-z]{2,})\\3");
        Pattern num = Pattern.compile("[0-9]");

        String input = scanner.nextLine();

        Matcher wordMatcher = words.matcher(input);
        Matcher numMatcher = num.matcher(input);

        List<String> valid = new ArrayList<>();

        BigDecimal sum = new BigDecimal(1);


        while(numMatcher.find()){
            int number = Integer.parseInt(numMatcher.group());
            sum = sum.multiply(BigDecimal.valueOf(number));
        }

        int emojis = 0;

        while(wordMatcher.find()){


            String word = wordMatcher.group();

            BigDecimal asciiSum = new BigDecimal(0);

            for (int i = 0; i < word.length(); i++) {
                char sym = word.charAt(i);
                if(Character.isLetter(sym)){
                    asciiSum = asciiSum.add(BigDecimal.valueOf(sym));
                }

            }

            if(asciiSum.compareTo(sum) == 0 || asciiSum.compareTo(sum) == 1 ){
                valid.add(word);
            }
            emojis++;

        }

        System.out.println("Cool threshold: " + sum);

        System.out.printf("%d emojis found in the text.",emojis);

        System.out.println(" The cool ones are:");

        for (var item:valid) {
            System.out.println(item);
        }

    }
}
