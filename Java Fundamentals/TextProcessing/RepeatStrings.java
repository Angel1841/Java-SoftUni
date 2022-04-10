import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            int count = word.length();

            for (int j = 0; j < count; j++) {
                System.out.print(word);
            }

        }
    }
}
