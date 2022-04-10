import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String sentence = scanner.nextLine();

        int index = sentence.indexOf(toRemove);

        while(index != -1){

            String first = sentence.substring(0, index);
            String second = sentence.substring(index + toRemove.length());

            sentence = first + second;

            index = sentence.indexOf(toRemove);

        }

        System.out.println(sentence);

    }
}
