import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rnd = new Random();

        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            int num = rnd.nextInt(words.length);
        }

        System.out.println(String.join("\n",words));

    }
}
