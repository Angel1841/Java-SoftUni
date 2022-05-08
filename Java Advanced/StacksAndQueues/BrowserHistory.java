import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        ArrayDeque<String> history = new ArrayDeque<>();

        String currentUrl = "";

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }
                String prev = history.pop();
                currentUrl = prev;

            } else {
                if(!currentUrl.equals("")){
                    history.push(currentUrl);
                }

                currentUrl = command;
            }
            System.out.println(currentUrl);
            command = scanner.nextLine();
        }

    }
}
