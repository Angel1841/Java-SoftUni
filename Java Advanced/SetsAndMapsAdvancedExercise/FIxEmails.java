import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FIxEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        LinkedHashMap<String, String> valid = new LinkedHashMap<>();

        while(!name.equals("stop")){

            String email = scanner.nextLine();

            if(!email.contains(".com") && !email.contains(".uk") && !email.contains(".us")){
                valid.put(name, email);
            }

            name = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : valid.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }

    }
}
