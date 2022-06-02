import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();

        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        for (int i = 0; i < n; i++) {
            firstSet.add(scanner.nextLine());
        }

        for (int i = 0; i < m; i++) {
            secondSet.add(scanner.nextLine());
        }

        firstSet.retainAll(secondSet);

        for (var el:firstSet) {
            System.out.print(el + " ");
        }
    }
}
