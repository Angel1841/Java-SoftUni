import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String raw = scanner.nextLine();

        String input = scanner.nextLine();

        while(!input.equals("Decode")){

            String[] tokens = input.split("\\|");

            String command = tokens[0];

            switch(command){

                case"ChangeAll":
                    String toSwap = tokens[1];
                    String swap = tokens[2];

                    raw = raw.replace(toSwap,swap);
                break;

                case"Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String toAdd = tokens[2];

                    raw = raw.substring(0,index) + toAdd + raw.substring(index);
                break;

                case"Move":
                    int num = Integer.parseInt(tokens[1]);

                    String firstPart = raw.substring(0,num);
                    String secondPart = raw.substring(num);

                    raw = secondPart.concat(firstPart);

                break;

            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s",raw);

    }
}
