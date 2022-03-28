import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")){

            if(PalindromeChecker(input)){
                System.out.println("true");
            } else{
                System.out.println("false");
            }

            input = scanner.nextLine();
        }


    }

    public static boolean PalindromeChecker(String input){

        String reversed = "";

            int number = Integer.parseInt(input);

            for (int i = 0;i<input.length();i++) {
                reversed += number % 10;
                number /= 10;
            }

            if(reversed.equals(input)){
                return true;
            } else{
                return false;
            }

    }


}
