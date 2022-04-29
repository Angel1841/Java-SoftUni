import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String input = scanner.nextLine();

        while(!input.equals("Done")){

            String[] data = input.split(" ");
            String command = data[0];

            switch(command){
                case"TakeOdd":
                    StringBuilder sb = new StringBuilder();

                    for (int i = 1; i < word.length(); i+=2) {
                        char letter = word.charAt(i);
                        sb.append(letter);
                    }

                    word = sb.toString();

                    System.out.println(word);
                break;

                case"Cut":
                int index = Integer.parseInt(data[1]);
                int repeats = Integer.parseInt(data[2]);

                word = word.substring(0,index)+word.substring(index + repeats);

                    System.out.println(word);
                break;

                case"Substitute":
                    String check = data[1];
                    String replacement = data[2];

                    if(word.contains(check)){
                        word = word.replace(check,replacement);
                        System.out.println(word);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scanner.nextLine();

        }

        System.out.printf("Your password is: %s",word);
    }
}
