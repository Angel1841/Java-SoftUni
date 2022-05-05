import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]{3,})!:\\[(?<text>[A-Za-z]+)\\]");

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){

                System.out.print(matcher.group("command") + ": ");

                for (int j = 0; j < matcher.group("text").length(); j++) {
                    int num = matcher.group("text").charAt(j);
                    System.out.print(num + " ");
                }

                System.out.println();

            }else{
                System.out.println("The message is invalid");
            }

        }
    }
}
