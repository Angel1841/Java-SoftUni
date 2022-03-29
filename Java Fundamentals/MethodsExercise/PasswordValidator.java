import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if(CharacterNums(password) && CharacterChecker(password) && DigitsNum(password)){
            System.out.println("Password is valid");
        }
        if(!CharacterNums(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!CharacterChecker(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!DigitsNum(password)){
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean CharacterNums(String password){
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
                count++;
        }
        if(count >= 6 && count <= 10){
            return true;
        }
        return false;
    }

    public static boolean CharacterChecker(String password){
        for (int i = 0; i < password.length(); i++) {
            if ((!Character.isLetterOrDigit(password.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean DigitsNum(String password){
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                counter++;
            }
        }
        if(counter >= 2) {
            return true;
        }
        return false;
    }
}
