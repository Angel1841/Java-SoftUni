import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String sym = scanner.nextLine();

        System.out.printf("%s%s%s",name1,sym,name2);
    }
}
