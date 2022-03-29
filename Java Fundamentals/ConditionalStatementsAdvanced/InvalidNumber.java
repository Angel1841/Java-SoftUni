import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isValid = (n <=200 && n>=100) || n == 0;

        if(!isValid){
            System.out.println("invalid");
        }
    }
}
