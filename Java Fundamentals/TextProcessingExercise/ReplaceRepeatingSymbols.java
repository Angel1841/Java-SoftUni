import java.util.Scanner;

public class ReplaceRepeatingSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < sb.length() - 1; i++) {

            char current = sb.charAt(i);
            char next = sb.charAt(i+1);

            if(current == next){
                sb.deleteCharAt(i);
                i--;
            }

        }

        System.out.println(sb);

    }
}
