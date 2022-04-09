import java.util.*;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> registry = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split(" ");

            String command = data[0];


            switch(command){

                case"register":
                    String name = data[1];
                    String code = data[2];

                    if(registry.containsKey(name)){
                        System.out.printf("ERROR: already registered with plate number %s%n",code);
                    } else{

                        registry.put(name, code);
                        System.out.printf("%s registered %s successfully%n",name,code);
                    }
                    break;

                case"unregister":

                    String toUnregister = data[1];

                    if(!registry.containsKey(toUnregister)){
                        System.out.printf("ERROR: user %s not found%n",toUnregister);
                    } else{
                        System.out.printf("%s unregistered successfully%n",toUnregister);
                        registry.remove(toUnregister);
                    }
                    break;
            }
        }

        registry.forEach((k,v) -> System.out.printf("%s => %s%n",k,v));
    }
}
