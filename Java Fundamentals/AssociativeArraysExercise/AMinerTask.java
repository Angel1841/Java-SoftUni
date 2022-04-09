import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while(!command.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!resources.containsKey(command)){
                resources.put(command, quantity);
            }else{
                resources.put(command, resources.get(command) + quantity);
            }

            command = scanner.nextLine();
        }

        resources.forEach((key, value) -> System.out.printf("%s -> %d%n",key,value));
    }
}
