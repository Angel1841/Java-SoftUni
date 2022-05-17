import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < line.length(); i++) {
            char sym = line.charAt(i);

            if(sym == '('){
                stack.push(i);
            } else if(sym == ')'){
                int startIndex = stack.pop();
                System.out.println(line.substring(startIndex, i + 1));
            }

        }
    }
}
