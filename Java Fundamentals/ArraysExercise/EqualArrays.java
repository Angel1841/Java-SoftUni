import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] arrayWithTwoZero = new int[input.length + 2];

        for (int i = 1, j = 0; i <= input.length; i++, j++) {  //добавяне на две нули, по една отпред и отзад!
            arrayWithTwoZero[i] = input[j];
        }
        arrayWithTwoZero[arrayWithTwoZero.length - 1] = 0;
        arrayWithTwoZero[0] = 0;

        int sumLeft = 0;
        int sumRight = 0;
        int index = -1;


        for (int i = 0; i < arrayWithTwoZero.length - 2; i++) {
            sumLeft += arrayWithTwoZero[i];
            sumRight = 0;
            for (int j = arrayWithTwoZero.length - 1; (j > 0 && (i + 1) < j); j--) {

                sumRight += arrayWithTwoZero[j];

                if (sumLeft == sumRight && j - i == 2) {
                    index = i;
                }
            }
        }
        if (index > -1) {
            System.out.println(index);
        } else if (index == -1) {
            System.out.println("no");
        }
    }
}
