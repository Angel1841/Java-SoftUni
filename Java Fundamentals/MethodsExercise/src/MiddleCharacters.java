import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();;
        MidFinder(input);
    }

    private static void MidFinder(String input){
        if(input.length() % 2 == 0){
            String output = "";
            output += input.charAt(input.length()/2 - 1);
            output += input.charAt(input.length()/2);
            System.out.println(output);
        } else{

            char letter = input.charAt(input.length()/2);
            System.out.println(letter);
        }


    }
}
