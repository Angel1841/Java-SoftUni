import java.util.Scanner;

public class ProjectCretion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arh = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int time = a * 3;
        System.out.println("The architect " + arh + " will need " + time + " hours to complete " + a + " project/s.");

    }
}
