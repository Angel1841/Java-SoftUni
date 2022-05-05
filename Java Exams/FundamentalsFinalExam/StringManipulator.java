import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String raw = scanner.nextLine();

        String input = scanner.nextLine();

        while(!input.equals("End")){

            String[] tokens = input.split(" ");

            String command = tokens[0];

            switch(command){
                case"Translate":

                    char toReplace = tokens[1].charAt(0);
                    char replacement = tokens[2].charAt(0);

                    raw = raw.replace(toReplace,replacement);

                    System.out.println(raw);

                    break;

                case"Includes":

                    String toCheck = tokens[1];

                    if(raw.contains(toCheck)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }

                    break;

                case"Start":

                    String start = tokens[1];

                    if(raw.startsWith(start)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }

                    break;

                case"Lowercase":

                    raw = raw.toLowerCase();

                    System.out.println(raw);

                    break;

                case"FindIndex":

                    char sym = tokens[1].charAt(0);

                    System.out.println(raw.lastIndexOf(sym));

                    break;


                case"Remove":

                    int startIndex = Integer.parseInt(tokens[1]);
                    int count = Integer.parseInt(tokens[2]);

                    raw = raw.substring(0,startIndex) + raw.substring(startIndex + count);

                    System.out.println(raw);

                    break;


            }

            input = scanner.nextLine();
        }
    }
}
