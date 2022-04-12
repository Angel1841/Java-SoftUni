import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsernames {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       List<String> input = Arrays.stream(scanner.nextLine()
               .split(", "))
               .filter(a -> a.length() >= 3)
               .filter(b -> b.matches("^[A-Za-z0-9_-]*$"))
               .filter(c -> c.length() <= 16)
               .map(String::toString)
               .collect(Collectors.toList());

        for (String s : input) {
            System.out.println(s);
        }

    }
}
