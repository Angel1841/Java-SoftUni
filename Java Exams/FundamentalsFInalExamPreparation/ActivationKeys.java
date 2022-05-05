import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String raw = scanner.nextLine();

        String command = scanner.nextLine();

        while(!command.equals("Generate")){

            String[] tokens = command.split(">>>");

            String action = tokens[0];

            switch(action){
                case"Slice":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);

                    raw = raw.substring(0,startIndex) + raw.substring(endIndex);

                    System.out.println(raw);

                    break;

                case"Contains":

                    if(raw.contains(tokens[1])){
                        System.out.printf("%s contains %s",raw,tokens[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }

                    break;

                case"Flip":

                    String type = tokens[1];
                    int start = Integer.parseInt(tokens[2]);
                    int end = Integer.parseInt(tokens[3]);

                    if(type.equals("Upper")) {


                            raw = raw.substring(0,start) + raw.substring(start,end).toUpperCase() + raw.substring(end);


                    } else if(type.equals("Lower")) {

                        raw = raw.substring(0,start) + raw.substring(start,end).toLowerCase() + raw.substring(end);
                    }

                    System.out.println(raw);
                    break;

            }
                command = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s",raw);
    }
}
