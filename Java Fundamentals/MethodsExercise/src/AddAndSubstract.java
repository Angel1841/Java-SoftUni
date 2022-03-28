import java.util.Scanner;

public class AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(substract(sum(a,b),c));

    }

    private static int sum(int a, int b){
        return a + b;
    }

    private static int substract(int a, int b){
        return a - b ;
    }
}
