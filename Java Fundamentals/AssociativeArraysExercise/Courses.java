import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> list = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("end")){

            String[] information = input.split(" : ");

            String course = information[0];

            String user = information[1];


            if(list.containsKey(course)){
               list.get(course).add(user);
            } else {
                list.put(course, new ArrayList<>());
                list.get(course).add(user);
            }


            input = scanner.nextLine();
        }


        for (Map.Entry<String, ArrayList<String>> entry : list.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            for (String human: entry.getValue()) {
                System.out.printf("-- %s%n",human);
            }

        }
    }
}
