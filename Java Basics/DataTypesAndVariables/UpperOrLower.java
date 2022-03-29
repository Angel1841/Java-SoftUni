import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if(letter <= 122 && letter >= 97){
            System.out.println("lower-case");
        } else{
            System.out.println("upper-case");
        }
    }
}
