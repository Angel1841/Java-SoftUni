import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecryptMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        char realsym = ' ';
        List myList = new ArrayList();

        for(int i = 0;i<n;i++){
            char input = scanner.nextLine().charAt(0);
                int number = input + key;
                realsym = (char)number;
            myList.add(realsym);
        }

        for (Object num :myList) {
            System.out.print(num);
        }

    }
}
