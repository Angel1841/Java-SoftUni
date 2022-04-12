import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] data = scanner.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char letter : data) {
            int toAdd = letter + 3;
            sb.append((char)toAdd);
        }

        System.out.println(sb);
    }
}
