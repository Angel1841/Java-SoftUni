import java.util.Scanner;

public class CharacterMulitplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");

        char[] text1 = data[0].toCharArray();
        char[] text2 = data[1].toCharArray();

        int shorterText = Math.min(text1.length,text2.length);
        int longerText = Math.max(text1.length,text2.length);

        int sum = 0;

        for (int i = 0; i < longerText; i++) {

            if(i < shorterText){
                sum += text1[i] * text2[i];
            } else if(text1.length > text2.length){
                sum += text1[i];
            } else {
                sum += text2[i];
            }

        }

        System.out.println(sum);

    }
}