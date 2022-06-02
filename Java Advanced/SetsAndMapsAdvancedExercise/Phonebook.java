import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashMap<String, String> contacts = new HashMap<>();

        while(!input.equals("search")){

            String[] tokens = input.split("-");

            String name = tokens[0];
            String number = tokens[1];

            contacts.put(name, number);

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();

        while(!command.equals("stop")){

            String name = command;

            if(!contacts.containsKey(name)){
                System.out.printf("Contact %s does not exist.%n",name);
            } else{
                System.out.printf("%s -> %s%n",name,contacts.get(name));
            }

            command = scanner.nextLine();
        }

    }
}
