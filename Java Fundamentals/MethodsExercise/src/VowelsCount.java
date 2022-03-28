import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase(Locale.ROOT);
        VowelCounter(word);
    }

    static void VowelCounter(String word){
        int counter = 0;

        for(int i = 0;i<word.length();i++){
            char letter = word.charAt(i);
            if(letter == ('a') || letter == ('o') || letter == ('u') || letter == ('i') || letter == ('e')){
                counter++;
            }
        }
            System.out.println(counter);
        }
}

