import java.util.Scanner;

public class Sequence2k {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int next = 1;
        while(next <= n){
            System.out.println(next);
            next =next * 2;
            next = next + 1;
        }

    }
}
