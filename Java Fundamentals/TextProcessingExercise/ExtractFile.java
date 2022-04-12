import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String name = input.substring(input.lastIndexOf("\\" ) + 1, input.indexOf("."));
        String extension = input.substring(input.lastIndexOf(".") + 1);

        System.out.println("File name: ".concat(name));
        System.out.println("File extension: ".concat(extension));
    }
}
