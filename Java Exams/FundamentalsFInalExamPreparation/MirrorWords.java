import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#@])(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1");

        Matcher matcher = pattern.matcher(input);

        List<String> valid = new ArrayList<>();

        int count = 0;
        int mirrors = 0;

        while(matcher.find()){
            String first = matcher.group("first");
            String second = matcher.group("second");
            count++;

            StringBuilder sb = new StringBuilder(first);

            if(sb.reverse().toString().equals(second)){
                valid.add(String.format("%s <=> %s",first,second));
                mirrors++;
            }

        }

        if(count == 0){
            System.out.println("No word pairs found!");
        }else{
            System.out.printf("%d word pairs found!%n",count);
        }


        if(mirrors > 0){
            System.out.println("The mirror words are:");

            System.out.println(String.join(", ",valid));
        } else {
            System.out.println("No mirror words!");
        }


    }
}
