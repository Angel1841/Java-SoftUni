import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        int first = 0;

        for(int i=0; i<rotations;i++){
            first = arr1[0];

            for(int j = 0;j<arr1.length - 1;j++){
                arr1[j] = arr1[j+1];
            }

            arr1[arr1.length - 1] = first;
        }

        for (var item:arr1 ) {
            System.out.print(item + " ");
        }
    }
}
