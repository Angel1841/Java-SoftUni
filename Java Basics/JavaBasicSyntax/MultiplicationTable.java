import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " X " + i + " = " + n*i );
        }
    }
}
