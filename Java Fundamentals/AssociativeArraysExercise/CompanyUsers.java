import java.util.*;
import java.util.stream.Collectors;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> employees = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("End")){

            String[] data = input.split(" -> ");

            String company = data[0];
            String id = data[1];

            if(employees.containsKey(company)){
                employees.get(company).add(id);
            } else if(!employees.containsKey(company)) {
                employees.put(company, new ArrayList<>());
                employees.get(company).add(id);
            }

            input = scanner.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : employees.entrySet()) {
            System.out.printf("%s%n",entry.getKey());

            List<String> filtered = entry.getValue().stream().distinct().collect(Collectors.toList());

            for (var id: filtered) {
                System.out.printf("-- %s%n",id);
            }
        }
    }
}
