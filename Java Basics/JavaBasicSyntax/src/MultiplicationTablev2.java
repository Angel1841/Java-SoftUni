import java.util.Scanner;

public class MultiplicationTablev2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if(b < 10)
        {
            for (int i = b; i <= 10; i++) {
                System.out.println(n + " X " + i + " = " + n * i);
            }
        }
        else{
            System.out.println(n + " X " + b + " = " + n * b);
        }


    }
}
