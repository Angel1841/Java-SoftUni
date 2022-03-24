import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr1.length; i++) {
                boolean top = true;
                for (int j = i+1; j < arr1.length; j++) {

                    if(arr1[i] <= arr1[j]){
                        top = false;
                    }
                }
                if(top) { System.out.println(arr1[i]);}
        }

    }
}
